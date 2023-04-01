package com.colegiox.colegio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class EstudianteController {

    @GetMapping("/registro")
    public String ShowForm(Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);


        return "registro";

    }

}
