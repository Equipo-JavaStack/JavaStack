package com.gov.cartera.JavaStackSolution.entidades;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="empresas")
public class Empresa {


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

    @OneToMany(mappedBy = "idEmpresa", fetch = FetchType.LAZY)
    private List<Empleados> empleados;


    public Empresa() {
    }

    public Empresa(long idEmpresa, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa, boolean estadoEmpresa, List<Empleados> empleados) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.estadoEmpresa = estadoEmpresa;
        this.empleados = empleados;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public boolean isEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(boolean estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleados> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", telefonoEmpresa='" + telefonoEmpresa + '\'' +
                ", nitEmpresa='" + nitEmpresa + '\'' +
                ", estadoEmpresa=" + estadoEmpresa +
                ", empleados=" + empleados +
                '}';
    }
}
