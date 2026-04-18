package udb.edu.sv.desafiodwf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.edu.sv.desafiodwf.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {}