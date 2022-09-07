package co.gov.javastack.contable.cartera.service;


import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMovimientoDineroService {

    public MovimientoDinero findById(int id);

    public List<MovimientoDinero> findAll();

    public MovimientoDinero createUsuario(MovimientoDinero movimientoDinero);

    public MovimientoDinero updateUsuario(MovimientoDinero movimientoDinero);

    public void deleteUsuario(long id);

}
