package udb.edu.sv.desafiodwf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udb.edu.sv.desafiodwf.domain.AlumnoMateria;
import udb.edu.sv.desafiodwf.domain.AlumnoMateriaId;
import udb.edu.sv.desafiodwf.repository.AlumnoMateriaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/alumno-materia")
public class AlumnoMateriaController {

    private final AlumnoMateriaRepository alumnoMateriaRepository;

    public AlumnoMateriaController(AlumnoMateriaRepository alumnoMateriaRepository) {
        this.alumnoMateriaRepository = alumnoMateriaRepository;
    }

    @GetMapping
    public List<AlumnoMateria> getAll() {
        return alumnoMateriaRepository.findAll();
    }

    @GetMapping("/{idAlumno}/{idMateria}")
    public ResponseEntity<AlumnoMateria> getById(@PathVariable Long idAlumno, @PathVariable Long idMateria) {
        AlumnoMateriaId id = new AlumnoMateriaId(idAlumno, idMateria);
        return alumnoMateriaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().<AlumnoMateria>build());
    }

    @PostMapping
    public AlumnoMateria create(@RequestBody AlumnoMateria alumnoMateria) {
        return alumnoMateriaRepository.save(alumnoMateria);
    }

    @DeleteMapping("/{idAlumno}/{idMateria}")
    public ResponseEntity<Void> delete(@PathVariable Long idAlumno, @PathVariable Long idMateria) {
        AlumnoMateriaId id = new AlumnoMateriaId(idAlumno, idMateria);
        return alumnoMateriaRepository.findById(id)
                .map(existing -> {
                    alumnoMateriaRepository.delete(existing);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().<Void>build());
    }
}
