package edu.cibertec.webappt1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.cibertec.webappt1.entities.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
