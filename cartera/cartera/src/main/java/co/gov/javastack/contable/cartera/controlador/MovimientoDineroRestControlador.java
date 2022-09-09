package co.gov.javastack.contable.cartera.controlador;

<<<<<<< HEAD
public class MovimientoDineroRestControlador {
=======

import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import co.gov.javastack.contable.cartera.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovimientoDineroRestControlador {

 @Autowired
    private IMovimientoDineroService movimientoDineroService;

    @GetMapping("/movimientoDinero/{id}")
    public MovimientoDinero findById(@PathVariable int id){return movimientoDineroService.findById(id);}

    @GetMapping("/movimientoDinero")
    public List<MovimientoDinero> findAll(){
        return this.movimientoDineroService.findAll();
    }

    @PostMapping("/movimientoDinero")
    public MovimientoDinero createMovimientoDinero (@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoDineroService.createMovimientoDinero(movimientoDinero);
    }

    @PutMapping("/movimientoDinero")
    public MovimientoDinero updateMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        return this.movimientoDineroService.updateMovimientoDinero(movimientoDinero);
    }

    @DeleteMapping("/movimientoDinero/{id}")
    public void deleteMovimientoDinero(@PathVariable long id){
        this.movimientoDineroService.deteleMovimientoDinero(id);
    }

>>>>>>> development
}
