import java.util.Date;

public class TarjetaDebito extends Tarjeta {
    private Double saldoDisponible;

    public TarjetaDebito(String numeroFrente, Integer codigoSegurdad, Integer fechaExpiracion, Double saldoDisponible) {
        super(numeroFrente, codigoSegurdad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
