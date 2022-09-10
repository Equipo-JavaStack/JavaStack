package co.gov.javastack.contable.cartera.service;


import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMovimientoDineroService {

  public MovimientoDinero findById (int id);

  public List<MovimientoDinero> findAll();

  public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);

  public MovimientoDinero updateMovimientoDinero(MovimientoDinero movimientoDinero);

  public void deteleMovimientoDinero(long id);


}
