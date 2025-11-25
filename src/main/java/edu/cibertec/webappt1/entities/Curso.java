package edu.cibertec.webappt1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_curso", length = 100)
    private String nombreCurso;

    @Column(name = "ciclo", length = 20)
    private String ciclo;

    @Column(name = "docente", length = 100)
    private String docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;

}