package co.gov.javastack.contable.cartera.repositorio;

import co.gov.javastack.contable.cartera.entidades.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepositorio extends CrudRepository<Empresa, Long> {
}
