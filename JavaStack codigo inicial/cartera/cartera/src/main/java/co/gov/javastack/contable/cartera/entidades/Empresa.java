package co.gov.javastack.contable.cartera.entidades;


import javax.persistence.*;

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
    private long telefonoEmpresa;

    @Column(name="nit_Empresa")
    private long nitEmpresa;

    @Column(name="estado_Empresa")
    private boolean estadoEmpresa;


    public Empresa() {
    }

    public Empresa(long idEmpresa, String nombreEmpresa, String direccionEmpresa, long telefonoEmpresa, long nitEmpresa, boolean estadoEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.estadoEmpresa = estadoEmpresa;
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

    public long getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(long telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public long getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public boolean isEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(boolean estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
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
                '}';
    }


}
