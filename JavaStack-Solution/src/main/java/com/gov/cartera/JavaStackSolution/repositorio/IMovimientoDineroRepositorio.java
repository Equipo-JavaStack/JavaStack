package com.gov.cartera.JavaStackSolution.repositorio;


import com.gov.cartera.JavaStackSolution.entidades.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientoDineroRepositorio extends CrudRepository<MovimientoDinero, Long> {
}
