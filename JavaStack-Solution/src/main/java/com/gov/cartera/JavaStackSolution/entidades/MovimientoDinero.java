package com.gov.cartera.JavaStackSolution.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name="movimiento_Dinero")
public class MovimientoDinero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimiento;
    @Column(name="concepto_Dinero")
    private String conceptoDinero;

    @Column(name="ingreso_Dinero")
    private long ingresoDinero;

    @Column(name="egreso_Dinero")
    private long egresoDinero;

    @Column(name="usuario_Movimiento")
    private String usuarioMovimiento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EMPLEADO_ID", nullable = false)
    private Empleados idEmpleados;


}
