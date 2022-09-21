package co.gov.javastack.contable.cartera.service;

import co.gov.javastack.contable.cartera.entidades.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(int id);

    public List<Empresa> findAll();

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Empresa empresa);

    public void deleteEmpresa(long id);

}
