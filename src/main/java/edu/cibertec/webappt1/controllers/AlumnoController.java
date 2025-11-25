package edu.cibertec.webappt1.controllers;

import edu.cibertec.webappt1.entities.Alumno;
import edu.cibertec.webappt1.repositories.AlumnoRepository;
import edu.cibertec.webappt1.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepo;

    @Autowired
    private CarreraRepository carreraRepo;

    @GetMapping("/nuevo")
    public String nuevoAlumno(Model model) {
        model.addAttribute("alumno", new Alumno());
        model.addAttribute("carreras", carreraRepo.findAll());
        return "alumno_nuevo";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Alumno alumno) {
        alumnoRepo.save(alumno);
        return "redirect:/alumno/nuevo?exito";
    }
}
