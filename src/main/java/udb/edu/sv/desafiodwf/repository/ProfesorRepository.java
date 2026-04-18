package udb.edu.sv.desafiodwf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udb.edu.sv.desafiodwf.domain.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {}