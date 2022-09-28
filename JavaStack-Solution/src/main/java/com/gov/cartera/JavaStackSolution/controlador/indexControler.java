package com.gov.cartera.JavaStackSolution.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class indexControler {

    @RequestMapping("/")
    public String index(Model model){
       var mensaje = "SISTEMA DE GESTION DE INGRESOS Y EGRESOS";


       model.addAttribute("mensaje",mensaje);

       return "index";
    }
}
