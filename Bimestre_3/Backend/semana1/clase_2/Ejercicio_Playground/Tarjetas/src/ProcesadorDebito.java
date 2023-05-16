public class ProcesadorDebito extends Procesador {
    public ProcesadorDebito(Double monto) {
        super(monto);
    }

    @Override
    protected String procesarPago(Tarjeta tarjeta, Double monto) {
        String respuesta = "El pago no pudo ser procesado correctamente";
        if (autorizarPago(tarjeta) &&tarjeta instanceof TarjetaDebito) {
            TarjetaDebito tarjetaDebito = (TarjetaDebito) tarjeta;
            if(tarjetaDebito.getSaldoDisponible() > monto){
                respuesta = "El pago pudo ser procesado correctamente";
                }
            }
            return respuesta;
        }
    }

