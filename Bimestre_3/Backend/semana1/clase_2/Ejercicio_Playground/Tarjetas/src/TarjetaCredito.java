import java.util.Date;

public class TarjetaCredito extends Tarjeta{
    private Double saldoUtilizado;
    private Double limite;

    public TarjetaCredito(String numeroFrente, Integer codigoSegurdad, Integer fechaExpiracion, Double saldoUtilizado, Double limite) {
        super(numeroFrente, codigoSegurdad, fechaExpiracion);
        this.saldoUtilizado = saldoUtilizado;
        this.limite = limite;
    }

    public Double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(Double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
