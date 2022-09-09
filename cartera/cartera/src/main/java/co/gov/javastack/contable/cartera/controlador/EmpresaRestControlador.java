package co.gov.javastack.contable.cartera.controlador;

<<<<<<< HEAD
public class EmpresaRestControlador {
=======

import co.gov.javastack.contable.cartera.entidades.Empresa;
import co.gov.javastack.contable.cartera.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
>>>>>>> development
}
