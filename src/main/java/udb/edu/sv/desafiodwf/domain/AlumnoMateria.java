package udb.edu.sv.desafiodwf.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "alumno_materia")
public class AlumnoMateria {

    @EmbeddedId
    private AlumnoMateriaId id;

    @ManyToOne(optional = false)
    @MapsId("idAlumno")
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    @ManyToOne(optional = false)
    @MapsId("idMateria")
    @JoinColumn(name = "id_materia")
    private Materia materia;

    public AlumnoMateria() {}

    public AlumnoMateria(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.id = new AlumnoMateriaId(alumno.getId(), materia.getId());
    }

    public AlumnoMateriaId getId() { return id; }
    public Alumno getAlumno() { return alumno; }
    public Materia getMateria() { return materia; }
}
