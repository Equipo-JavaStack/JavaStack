package co.gov.javastack.contable.cartera.repositorio;

import co.gov.javastack.contable.cartera.entidades.Empleados;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadosRepositorio extends CrudRepository<Empleados, Long> {
}
