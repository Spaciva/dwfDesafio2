package udb.edu.sv.desafiodwf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import udb.edu.sv.desafiodwf.domain.*;
import udb.edu.sv.desafiodwf.repository.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersistenciaDesafioTest {

    @Autowired ProfesorRepository profesorRepository;
    @Autowired MateriaRepository materiaRepository;
    @Autowired AlumnoRepository alumnoRepository;
    @Autowired AlumnoMateriaRepository alumnoMateriaRepository;

    @Test
    @Transactional
    @Commit
    void shouldInsertTwoRowsPerTable() {

        // 1) PROFESOR: 2 nuevos
        Profesor p1 = profesorRepository.save(new Profesor("Profe Test 1"));
        Profesor p2 = profesorRepository.save(new Profesor("Profe Test 2"));
        assertNotNull(p1.getId());
        assertNotNull(p2.getId());

        // 2) ALUMNO: 2 nuevos
        Alumno a1 = alumnoRepository.save(new Alumno("AlumnoTest", "Uno"));
        Alumno a2 = alumnoRepository.save(new Alumno("AlumnoTest", "Dos"));
        assertNotNull(a1.getId());
        assertNotNull(a2.getId());

        // 3) MATERIA: 2 nuevas (amarradas a profes)
        Materia m1 = materiaRepository.save(new Materia("MateriaTest 1", p1));
        Materia m2 = materiaRepository.save(new Materia("MateriaTest 2", p2));
        assertNotNull(m1.getId());
        assertNotNull(m2.getId());

        // 4) ALUMNO_MATERIA: 2 nuevas inscripciones
        AlumnoMateria am1 = alumnoMateriaRepository.save(new AlumnoMateria(a1, m1));
        AlumnoMateria am2 = alumnoMateriaRepository.save(new AlumnoMateria(a2, m2));
        assertNotNull(am1.getId());
        assertNotNull(am2.getId());
    }
}