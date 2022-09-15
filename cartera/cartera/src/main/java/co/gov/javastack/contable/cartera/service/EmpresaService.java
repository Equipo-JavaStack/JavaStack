package co.gov.javastack.contable.cartera.service;
import co.gov.javastack.contable.cartera.entidades.Empresa;
import co.gov.javastack.contable.cartera.repositorio.IEmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    private IEmpresaRepositorio empresaRepositorio;

    @Override
    public Empresa findById(int id) {
        Optional<Empresa> empresa = empresaRepositorio.findById((long) id);
        return empresa.get();
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresa = (List<Empresa>) empresaRepositorio.findAll();
        return empresa;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {

        return empresaRepositorio.save(empresa);
    }

    @Override
    public Empresa updateEmpresa(Empresa empresa) {

        return empresaRepositorio.save(empresa);
    }

    @Override
    public void deleteEmpresa(long id) {
        empresaRepositorio.deleteById(id);

    }

}

