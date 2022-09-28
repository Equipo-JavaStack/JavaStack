package com.gov.cartera.JavaStackSolution.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString


@Table(name="empleados")
public class Empleados implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleados")
    private long idEmpleado;

    @Column(name="nombre_Empleado")
    private String nombreEmpleado;

    @Column(name="apellido_Empleado")
    private String apellidoEmpleado;

    @Column(name="correo_Empleado")
    private String correoEmpleado;

    @Column(name="pass_Empleado")
    private String pass;

    @Column(name="rol_Empleado")
    private Rol rol;


    @Column(name="estado_Empleado")
    private boolean estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "emperesa_id")
    private Empresa idEmpresa;

    //revisar
    @OneToMany(mappedBy = "idEmpleados")
    private List<MovimientoDinero> movimientoDinero;

}

