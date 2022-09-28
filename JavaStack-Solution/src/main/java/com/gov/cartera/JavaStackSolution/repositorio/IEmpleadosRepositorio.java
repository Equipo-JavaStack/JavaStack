package com.gov.cartera.JavaStackSolution.repositorio;


import com.gov.cartera.JavaStackSolution.entidades.Empleados;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadosRepositorio extends CrudRepository<Empleados, Long> {
}
