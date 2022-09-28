package com.gov.cartera.JavaStackSolution.service;

import com.gov.cartera.JavaStackSolution.entidades.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(int id);

    public List<Empresa> findAll();

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Empresa empresa);

    public void deleteEmpresa(long id);

}
