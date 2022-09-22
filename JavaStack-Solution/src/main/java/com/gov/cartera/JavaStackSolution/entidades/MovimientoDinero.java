package com.gov.cartera.JavaStackSolution.entidades;


import javax.persistence.*;

@Entity
@Table(name="movimiento_Dinero")
public class MovimientoDinero {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLEADO_ID", nullable = false)
    private Empleados idEmpleados;



    public MovimientoDinero() {
    }

    public MovimientoDinero(long idMovimiento, String conceptoDinero, long ingresoDinero, long egresoDinero, String usuarioMovimiento, Empleados idEmpleados) {
        this.idMovimiento = idMovimiento;
        this.conceptoDinero = conceptoDinero;
        this.ingresoDinero = ingresoDinero;
        this.egresoDinero = egresoDinero;
        this.usuarioMovimiento = usuarioMovimiento;
        this.idEmpleados = idEmpleados;
    }

    public long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getConceptoDinero() {
        return conceptoDinero;
    }

    public void setConceptoDinero(String conceptoDinero) {
        this.conceptoDinero = conceptoDinero;
    }

    public long getIngresoDinero() {
        return ingresoDinero;
    }

    public void setIngresoDinero(long ingresoDinero) {
        this.ingresoDinero = ingresoDinero;
    }

    public long getEgresoDinero() {
        return egresoDinero;
    }

    public void setEgresoDinero(long egresoDinero) {
        this.egresoDinero = egresoDinero;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public Empleados getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(Empleados idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimiento=" + idMovimiento +
                ", conceptoDinero='" + conceptoDinero + '\'' +
                ", ingresoDinero=" + ingresoDinero +
                ", egresoDinero=" + egresoDinero +
                ", usuarioMovimiento='" + usuarioMovimiento + '\'' +
                ", idEmpleados=" + idEmpleados +
                '}';
    }
}
