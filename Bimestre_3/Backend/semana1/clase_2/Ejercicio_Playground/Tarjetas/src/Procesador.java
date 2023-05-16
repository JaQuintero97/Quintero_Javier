public abstract class Procesador {
    private Double monto;

    public Procesador(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public boolean autorizarPago(Tarjeta tarjeta){
         return (tarjeta.getFechaExpiracion() > 2023);
    }

    protected abstract String procesarPago(Tarjeta tarjeta,Double monto);
}
