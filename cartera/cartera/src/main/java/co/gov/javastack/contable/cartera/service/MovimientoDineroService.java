package co.gov.javastack.contable.cartera.service;

import co.gov.javastack.contable.cartera.entidades.MovimientoDinero;
import co.gov.javastack.contable.cartera.repositorio.IMovimientoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public class MovimientoDineroService {
}

@Service
public class MovimientoDineroService implements IMovimientoDineroService {

    @Autowired
    private IMovimientoDineroRepositorio movimientoDineroRepositorio;
    @Override
    public MovimientoDinero findById(int id) {
        Optional<MovimientoDinero> movimientoDinero = movimientoDineroRepositorio.findById((long) id);
        return movimientoDinero.get();
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientoDinero = (List<MovimientoDinero>) movimientoDineroRepositorio.findAll();
        return movimientoDinero;
    }

    @Override
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero) {
        return movimientoDineroRepositorio.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero updateMovimientoDinero(MovimientoDinero movimientoDinero) {
        return movimientoDineroRepositorio.save(movimientoDinero);
    }

    @Override
    public void deteleMovimientoDinero(long id) { movimientoDineroRepositorio.deleteById(id);

    }
}





