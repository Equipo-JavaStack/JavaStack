package co.gov.javastack.contable.cartera.service;

import co.gov.javastack.contable.cartera.entidades.Empresa;
import co.gov.javastack.contable.cartera.repositorio.IEmpleadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    private IEmpleadosRepositorio empleadosRepositorio;
    @Override
    public Empresa findById(int id) {

        return null;
    }

    @Override
    public List<Empresa> findAll() {
        return null;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        return null;
    }

    @Override
    public Empresa updateEmpresa(Empresa empresa) {
        return null;
    }

    @Override
    public void deleteEmpresa(long id) {

    }
}
