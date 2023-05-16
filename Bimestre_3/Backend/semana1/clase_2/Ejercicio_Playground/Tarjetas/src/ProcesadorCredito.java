public class ProcesadorCredito extends Procesador{
    public ProcesadorCredito(Double monto) {
        super(monto);
    }

    @Override
    protected String procesarPago(Tarjeta tarjeta, Double monto) {
        String respuesta = "El pago no pudo ser procesado";
        if (autorizarPago(tarjeta) && tarjeta instanceof TarjetaCredito){
            TarjetaCredito tarjetaCredito = (TarjetaCredito) tarjeta;
            Double saldoActual = tarjetaCredito.getLimite() - (tarjetaCredito.getSaldoUtilizado()+monto) ;
            if ((tarjetaCredito.getSaldoUtilizado()+monto) < tarjetaCredito.getLimite()){
                respuesta = "El pago pudo ser procesado correctamente, tu saldo disponible es: " + saldoActual;
            }
            
        }
        return respuesta;
    }
}
