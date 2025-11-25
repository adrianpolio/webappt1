package edu.cibertec.webappt1.controllers;

import edu.cibertec.webappt1.entities.Alumno;
import edu.cibertec.webappt1.entities.Curso;
import edu.cibertec.webappt1.repositories.AlumnoRepository;
import edu.cibertec.webappt1.repositories.CarreraRepository;
import edu.cibertec.webappt1.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepo;

    @Autowired
    private CarreraRepository carreraRepo;

    @GetMapping("/listar")
    public String listarCursos(
            @RequestParam(value = "carreraId", required = false) Integer carreraId,
            Model model) {

        List<Curso> cursos;

        if (carreraId != null) {
            cursos = cursoRepo.findByCarreraId(carreraId);
        } else {
            cursos = cursoRepo.findAll();
        }

        model.addAttribute("carreras", carreraRepo.findAll());
        model.addAttribute("cursos", cursos);
        model.addAttribute("carreraId", carreraId);

        return "curso_listar";
    }
}

