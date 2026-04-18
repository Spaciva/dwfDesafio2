package udb.edu.sv.desafiodwf.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    public Materia() {}

    public Materia(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
}