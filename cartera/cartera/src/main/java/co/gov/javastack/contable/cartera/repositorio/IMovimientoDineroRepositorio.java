package co.gov.javastack.contable.cartera.repositorio;
import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;



public interface IMovimientoDineroRepositorio extends CrudRepository<MovimientoDinero, Long> {

}
