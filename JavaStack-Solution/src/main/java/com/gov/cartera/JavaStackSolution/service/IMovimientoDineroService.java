package com.gov.cartera.JavaStackSolution.service;


import com.gov.cartera.JavaStackSolution.entidades.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {

  public MovimientoDinero findById (int id);

  public List<MovimientoDinero> findAll();

  public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero);

  public MovimientoDinero updateMovimientoDinero(MovimientoDinero movimientoDinero);

  public void deteleMovimientoDinero(long id);


}
