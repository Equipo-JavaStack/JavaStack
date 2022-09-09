package co.gov.javastack.contable.cartera.entidades;


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

    @Column(name="id_usuario_Movimiento")
    private long id_usuario_Movimiento;


    public MovimientoDinero() {
    }

    public MovimientoDinero(long ingresoDinero, long egresoDinero, String conceptoDinero, String usuarioMovimiento, long id_usuario_Movimiento) {
        this.ingresoDinero = ingresoDinero;
        this.egresoDinero = egresoDinero;
        this.conceptoDinero = conceptoDinero;
        this.usuarioMovimiento = usuarioMovimiento;
        this.id_usuario_Movimiento= id_usuario_Movimiento;
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

    public String getConceptoDinero() {
        return conceptoDinero;
    }

    public void setConceptoDinero(String conceptoDinero) {
        this.conceptoDinero = conceptoDinero;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public long getId_usuario_Movimiento() {
        return id_usuario_Movimiento;
    }

    public void setId_usuario_Movimiento(long id_usuario_Movimiento) {
        this.id_usuario_Movimiento = id_usuario_Movimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimiento=" + idMovimiento +
                ", conceptoDinero='" + conceptoDinero + '\'' +
                ", ingresoDinero=" + ingresoDinero +
                ", egresoDinero=" + egresoDinero +
                ", usuarioMovimiento='" + usuarioMovimiento + '\'' +
                ", id_usuario_Movimiento=" + id_usuario_Movimiento +
                '}';
    }
}
