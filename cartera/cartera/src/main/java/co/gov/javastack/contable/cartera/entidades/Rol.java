package co.gov.javastack.contable.cartera.entidades;

public class Rol {

    private long idRol;
    private String descripcion;
    private Boolean estado;

    public Rol(long idRol, String descripcion, Boolean estado) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Long getIdRol() {

        return idRol;
    }

    public void setIdRol(Long idRol) {

        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
