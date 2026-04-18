package udb.edu.sv.desafiodwf.service;

import org.springframework.stereotype.Service;
import udb.edu.sv.desafiodwf.domain.Materia;
import udb.edu.sv.desafiodwf.repository.MateriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    public Optional<Materia> findById(Long id) {
        return materiaRepository.findById(id);
    }

    public Materia save(Materia materia) {
        return materiaRepository.save(materia);
    }

    public void delete(Materia materia) {
        materiaRepository.delete(materia);
    }
}
