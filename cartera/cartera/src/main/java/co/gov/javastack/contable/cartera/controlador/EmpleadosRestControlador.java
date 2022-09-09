package co.gov.javastack.contable.cartera.controlador;

<<<<<<< HEAD
public class EmpleadosRestControlador {
=======
import co.gov.javastack.contable.cartera.entidades.Empleados;
import co.gov.javastack.contable.cartera.service.IEmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadosRestControlador {

    @Autowired
    private IEmpleadosService empleadosService;

    @GetMapping("/Empleados/{id}")
    public Empleados findById(@PathVariable int id) { return empleadosService.findById(id);}

    @GetMapping("/Empleados")
    public List<Empleados> findAll() {return this.empleadosService.findAll();}

    @PostMapping("/Empleados")
    public Empleados createEmpleados (@RequestBody Empleados empleados) {return this.empleadosService.createEmpleados(empleados);}

    @PutMapping("/Empleados")
    public Empleados updateEmpleados (@RequestBody Empleados empleados) {return this.empleadosService.updateEmpleados(empleados);}

    @DeleteMapping("/Empleados/{id}")
    public void deleteUsuario (@PathVariable long id) {this.empleadosService.deleteEmpleados(id);}
>>>>>>> development
}
