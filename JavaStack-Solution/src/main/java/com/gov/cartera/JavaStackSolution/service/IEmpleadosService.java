package com.gov.cartera.JavaStackSolution.service;


import com.gov.cartera.JavaStackSolution.entidades.Empleados;

import java.util.List;

public interface IEmpleadosService {

    public Empleados findById (int id);

    public List<Empleados> findAll();

    public Empleados createEmpleados(Empleados empleados);

    public Empleados updateEmpleados(Empleados empleados);

    public void deleteEmpleados (long id);

}
