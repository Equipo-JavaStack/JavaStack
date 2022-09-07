package co.gov.javastack.contable.cartera.entidades;

public class Empleados {
    private long idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String empresaEmplado;
    private String correoEmpleado;
    private String pass;
    private Rol rol;
    private boolean estado;

    public Empleados(long idEmpleado, String nombreEmpleado, String apellidoEmpleado, String empresaEmplado, String correoEmpleado, String pass, Rol rol, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.empresaEmplado = empresaEmplado;
        this.correoEmpleado = correoEmpleado;
        this.pass = pass;
        this.rol = rol;
        this.estado = estado;
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
                '}';
    }
}
