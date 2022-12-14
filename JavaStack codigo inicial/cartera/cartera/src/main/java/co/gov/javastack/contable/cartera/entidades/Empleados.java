package co.gov.javastack.contable.cartera.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleados")
    private long idEmpleado;

    @Column(name="nombre_Empleado")
    private String nombreEmpleado;

    @Column(name="apellido_Empleado")
    private String apellidoEmpleado;

    @Column(name="empresa_Empleado")
    private String empresaEmplado;

    @Column(name="correo_Empleado")
    private String correoEmpleado;

    @Column(name="pass_Empleado")
    private String pass;

    @Column(name="rol_Empleado")
    private Rol rol;

    @Column(name="estado_Empleado")
    private boolean estado;

    @Column(name="id_Empresa_Empleado")
    private long id_Empresa_Empleado;


    public Empleados() {
    }

    public Empleados(long idEmpleado, String nombreEmpleado, String apellidoEmpleado, String empresaEmplado, String correoEmpleado, String pass, Rol rol, boolean estado, long id_Empresa_Empleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.empresaEmplado = empresaEmplado;
        this.correoEmpleado = correoEmpleado;
        this.pass = pass;
        this.rol = rol;
        this.estado = estado;
        this.id_Empresa_Empleado=id_Empresa_Empleado;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getEmpresaEmplado() {
        return empresaEmplado;
    }

    public void setEmpresaEmplado(String empresaEmplado) {
        this.empresaEmplado = empresaEmplado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public long getId_Empresa_Empleado() {
        return id_Empresa_Empleado;
    }

    public void setId_Empresa_Empleado(long id_Empresa_Empleado) {
        this.id_Empresa_Empleado = id_Empresa_Empleado;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", apellidoEmpleado='" + apellidoEmpleado + '\'' +
                ", empresaEmplado='" + empresaEmplado + '\'' +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", pass='" + pass + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                ", id_Empresa_Empleado=" + id_Empresa_Empleado +
                '}';
    }
}
