package co.gov.stack.contable.cartera.entidades;

public class MovimientoDinero {
    private long ingresoDinero;
    private long egresoDinero;
    private String conceptoDinero;
    private String usuarioMovimiento;

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
