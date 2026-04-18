package udb.edu.sv.desafiodwf.domain;


import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlumnoMateriaId implements Serializable {

    private Long idAlumno;
    private Long idMateria;

    public AlumnoMateriaId() {}

    public AlumnoMateriaId(Long idAlumno, Long idMateria) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public Long getIdAlumno() { return idAlumno; }
    public Long getIdMateria() { return idMateria; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlumnoMateriaId that)) return false;
        return Objects.equals(idAlumno, that.idAlumno) && Objects.equals(idMateria, that.idMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, idMateria);
    }
}
