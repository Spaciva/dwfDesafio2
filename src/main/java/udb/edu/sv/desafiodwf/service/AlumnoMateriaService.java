package udb.edu.sv.desafiodwf.service;

import org.springframework.stereotype.Service;
import udb.edu.sv.desafiodwf.domain.AlumnoMateria;
import udb.edu.sv.desafiodwf.domain.AlumnoMateriaId;
import udb.edu.sv.desafiodwf.repository.AlumnoMateriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoMateriaService {

    private final AlumnoMateriaRepository alumnoMateriaRepository;

    public AlumnoMateriaService(AlumnoMateriaRepository alumnoMateriaRepository) {
        this.alumnoMateriaRepository = alumnoMateriaRepository;
    }

    public List<AlumnoMateria> findAll() {
        return alumnoMateriaRepository.findAll();
    }

    public Optional<AlumnoMateria> findById(AlumnoMateriaId id) {
        return alumnoMateriaRepository.findById(id);
    }

    public AlumnoMateria save(AlumnoMateria alumnoMateria) {
        return alumnoMateriaRepository.save(alumnoMateria);
    }

    public void delete(AlumnoMateria alumnoMateria) {
        alumnoMateriaRepository.delete(alumnoMateria);
    }
}
