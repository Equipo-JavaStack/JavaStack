package com.gov.cartera.JavaStackSolution.controlador;


import com.gov.cartera.JavaStackSolution.entidades.MovimientoDinero;
import com.gov.cartera.JavaStackSolution.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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

}
