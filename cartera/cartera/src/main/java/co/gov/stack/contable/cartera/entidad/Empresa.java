package co.gov.stack.contable.cartera.entidad;

public class Empresa {

    private Long idEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private Long telefonoEmpresa;
    private Long nitEmpresa;
    private Boolean estadoEmpresa;


    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
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

    public Long getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(Long telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Long getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public Boolean getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(Boolean estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", telefonoEmpresa=" + telefonoEmpresa +
                ", nitEmpresa=" + nitEmpresa +
                ", estadoEmpresa=" + estadoEmpresa +
                '}';
    }
}
