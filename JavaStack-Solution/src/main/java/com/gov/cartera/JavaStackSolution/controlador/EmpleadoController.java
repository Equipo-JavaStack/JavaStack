package com.gov.cartera.JavaStackSolution.controlador;

import com.gov.cartera.JavaStackSolution.entidades.Empleados;
import com.gov.cartera.JavaStackSolution.entidades.Empresa;
import com.gov.cartera.JavaStackSolution.service.IEmpleadosService;
import com.gov.cartera.JavaStackSolution.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;


@Controller
public class EmpleadoController {

    @Autowired
    public IEmpleadosService empleadosService;
    @Autowired
    public IEmpresaService empresaService;

    @GetMapping("/empleados/listemplados")
    public String getListEmpleados(Model model){
        List<Empleados> empleados = empleadosService.findAll();
        List<Empresa> empresas = empresaService.findAll();
        model.addAttribute("empleados", empleados);
        //model.addAttribute("empresas", empresas);

        for (Empleados emp : empleados) {
            System.out.println(emp.toString());
        }
        return "empleados/list";
    }

    @GetMapping("/empleados/modificarUser")
    public String createEmpleado(Model modelo){

        //Empleados
        Empleados empleado = new Empleados();
        modelo.addAttribute("empleados", empleado);

        //Empresas
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "empleados/modificar";

        //Rol


    }

    @PostMapping("/Guardar")
    public String guardarEmpleado(@ModelAttribute Empleados empleados){
        empleadosService.createEmpleados(empleados);

            return "redirect:/empleados/listemplados/";
        }
}
