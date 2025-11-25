package edu.cibertec.webappt1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_carrera", length = 100)
    private String nombreCarrera;

    @Column(name = "facultad", length = 100)
    private String facultad;

}