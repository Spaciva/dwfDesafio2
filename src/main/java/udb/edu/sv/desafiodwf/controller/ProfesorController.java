package udb.edu.sv.desafiodwf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udb.edu.sv.desafiodwf.domain.Profesor;
import udb.edu.sv.desafiodwf.repository.ProfesorRepository;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    private final ProfesorRepository profesorRepository;

    public ProfesorController(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @GetMapping
    public List<Profesor> getAll() {
        return profesorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesor> getById(@PathVariable Long id) {
        return profesorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Profesor create(@RequestBody Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> update(@PathVariable Long id, @RequestBody Profesor profesor) {
        return profesorRepository.findById(id)
                .map(existing -> {
                    existing.setNombre(profesor.getNombre());
                    return ResponseEntity.ok(profesorRepository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return profesorRepository.findById(id)
                .map(existing -> {
                    profesorRepository.delete(existing);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().<Void>build()); // Agrega <Void> aquí
    }
}
