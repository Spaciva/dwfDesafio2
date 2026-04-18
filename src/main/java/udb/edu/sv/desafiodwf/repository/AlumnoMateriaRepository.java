package udb.edu.sv.desafiodwf.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import udb.edu.sv.desafiodwf.domain.AlumnoMateria;
import udb.edu.sv.desafiodwf.domain.AlumnoMateriaId;

public interface AlumnoMateriaRepository extends JpaRepository<AlumnoMateria, AlumnoMateriaId> {}