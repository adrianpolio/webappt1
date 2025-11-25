package edu.cibertec.webappt1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import edu.cibertec.webappt1.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	List<Curso> findByCarreraId(Integer carreraId);
}
