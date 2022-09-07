package co.gov.javastack.contable.cartera.entidades;


import javax.persistence.*;

@Entity
@Table(name="movimiento_Dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="concepto_Dinero")
    private String conceptoDinero;

    @Column(name="ingreso_Dinero")
    private long ingresoDinero;

    @Column(name="egreso_Dinero")
    private long egresoDinero;

    @Column(name="usuario_Movimiento")
    private String usuarioMovimiento;


    public MovimientoDinero() {
    }

    public MovimientoDinero(long ingresoDinero, long egresoDinero, String conceptoDinero, String usuarioMovimiento) {
        this.ingresoDinero = ingresoDinero;
        this.egresoDinero = egresoDinero;
        this.conceptoDinero = conceptoDinero;
        this.usuarioMovimiento = usuarioMovimiento;
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

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "ingresoDinero=" + ingresoDinero +
                ", egresoDinero=" + egresoDinero +
                ", conceptoDinero='" + conceptoDinero + '\'' +
                ", usuarioMovimiento='" + usuarioMovimiento + '\'' +
                '}';
    }


}
