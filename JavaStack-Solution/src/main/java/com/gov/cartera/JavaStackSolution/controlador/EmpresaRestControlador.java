package com.gov.cartera.JavaStackSolution.controlador;


import com.gov.cartera.JavaStackSolution.entidades.Empresa;
import com.gov.cartera.JavaStackSolution.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class EmpresaRestControlador {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable int id){return empresaService.findById(id);}

    @GetMapping("/empresa")
    public List<Empresa> findAll(){return this.empresaService.findAll();}

    @PostMapping("/empresa")
    public Empresa createEmpresa (@RequestBody Empresa empresa){return this.empresaService.createEmpresa(empresa);}

    @PutMapping("/empresa")
    public Empresa updateEmpresa (@RequestBody Empresa empresa){return this.empresaService.updateEmpresa(empresa);}

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa (@PathVariable long id){this.empresaService.deleteEmpresa(id);}
}
