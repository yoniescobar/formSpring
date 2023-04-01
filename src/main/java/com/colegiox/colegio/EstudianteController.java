package com.colegiox.colegio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;


@Controller
public class EstudianteController {

    @GetMapping({"index","/"}) // localhost:8080/index
    public String index(){

        return "index";
    }

    @GetMapping("/registro") // localhost:8080/registro  Get
    public String ShowForm(Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);

        List<String> lisCarreras = Arrays.asList("Desarrollador ", "Diseñador", "Administrador", "Contador");
        //Arrays.asList: Convierte un arreglo en una lista de elementos de tipo String (List<String>)
        model.addAttribute("lisCarreras", lisCarreras);


        return "registro";

    }

    @PostMapping("/registro")
    public String submitForm(@ModelAttribute Estudiante estudiante, Model model){
        model.addAttribute("estudiante", estudiante);
        return "registro_success";
    }
}
