package udb.edu.sv.desafiodwf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udb.edu.sv.desafiodwf.domain.Alumno;
import udb.edu.sv.desafiodwf.repository.AlumnoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoRepository alumnoRepository;

    public AlumnoController(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @GetMapping
    public List<Alumno> getAll() {
        return alumnoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getById(@PathVariable Long id) {
        return alumnoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alumno> update(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoRepository.findById(id)
                .map(existing -> {
                    existing.setNombre(alumno.getNombre());
                    existing.setApellido(alumno.getApellido());
                    return ResponseEntity.ok(alumnoRepository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return alumnoRepository.findById(id)
                .map(existing -> {
                    alumnoRepository.delete(existing);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
