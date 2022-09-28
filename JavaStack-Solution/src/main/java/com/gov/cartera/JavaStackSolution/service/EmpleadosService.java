package com.gov.cartera.JavaStackSolution.service;


import com.gov.cartera.JavaStackSolution.entidades.Empleados;
import com.gov.cartera.JavaStackSolution.repositorio.IEmpleadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadosService implements IEmpleadosService {


    @Autowired
    private IEmpleadosRepositorio empleadosRepositorio;

    @Override
    public Empleados findById(int id) {
        Optional<Empleados> empleados = empleadosRepositorio.findById((long) id);
        return empleados.get();
    }

    @Override
    public List<Empleados> findAll() {
        List<Empleados> empleados = (List<Empleados>) empleadosRepositorio.findAll();
        return empleados;
    }

    @Override
    public Empleados createEmpleados(Empleados empleados) {
        return empleadosRepositorio.save(empleados);
    }

    @Override
    public Empleados updateEmpleados(Empleados empleados) {
        return empleadosRepositorio.save(empleados);
    }

    @Override
    public void deleteEmpleados(long id) {
        empleadosRepositorio.deleteById(id);

    }
}
