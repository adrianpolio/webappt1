package edu.cibertec.webappt1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_carrera", length = 100)
    private String nombreCarrera;

    @Column(name = "facultad", length = 100)
    private String facultad;

}