package com.gov.cartera.JavaStackSolution.entidades;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="empresas")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Empresa")
    private long idEmpresa;

    @Column(name="nombre_Empresa")
    private String nombreEmpresa;

    @Column(name="direccion_Empresa")
    private String direccionEmpresa;

    @Column(name="telefono_Empresa")
    private String telefonoEmpresa;

    @Column(name="nit_Empresa")
    private String nitEmpresa;

    @Column(name="estado_Empresa")
    private boolean estadoEmpresa;

    @OneToMany(mappedBy = "idEmpresa", fetch = FetchType.EAGER)
    private List<Empleados> empleados;


}
