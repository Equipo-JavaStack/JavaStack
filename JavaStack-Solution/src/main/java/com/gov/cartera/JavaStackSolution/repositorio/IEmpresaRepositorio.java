package com.gov.cartera.JavaStackSolution.repositorio;


import com.gov.cartera.JavaStackSolution.entidades.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepositorio extends CrudRepository<Empresa, Long> {
}
