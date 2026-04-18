package udb.edu.sv.desafiodwf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udb.edu.sv.desafiodwf.domain.Materia;
import udb.edu.sv.desafiodwf.repository.MateriaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    private final MateriaRepository materiaRepository;

    public MateriaController(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    @GetMapping
    public List<Materia> getAll() {
        return materiaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> getById(@PathVariable Long id) {
        return materiaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Materia create(@RequestBody Materia materia) {
        return materiaRepository.save(materia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materia> update(@PathVariable Long id, @RequestBody Materia materia) {
        return materiaRepository.findById(id)
                .map(existing -> {
                    existing.setNombre(materia.getNombre());
                    existing.setProfesor(materia.getProfesor());
                    return ResponseEntity.ok(materiaRepository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return materiaRepository.findById(id)
                .map(existing -> {
                    materiaRepository.delete(existing);
                    return ResponseEntity.noContent().<Void>build(); // aquí forzamos Void
                })
                .orElse(ResponseEntity.notFound().<Void>build());   // aquí también
    }

}
