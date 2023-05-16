import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTest {
    @Test
    public void procesarPagoDebitoPositivo(){
        Tarjeta tarjetaDebito = new TarjetaDebito("123",391,2025,5000.00);
        Procesador procesador = new ProcesadorDebito(400.00);
        Double monto = procesador.getMonto();
        String resultadoEsperado = "El pago pudo ser procesado correctamente";
        //CUANDO
        String resultado = procesador.procesarPago(tarjetaDebito,monto);
        System.out.println(resultado);
        //Entonces
        assertEquals(resultado,resultadoEsperado);
        AssertTrue)
    }
    @Test
    public void procesarPagoDebitoNegativo(){
        Tarjeta tarjetaDebito = new TarjetaDebito("123",391,2025,5000.00);
        Procesador procesador = new ProcesadorDebito(40000.00);
        Double monto = procesador.getMonto();
        String resultadoEsperado = "El pago no pudo ser procesado correctamente";
        //CUANDO
        String resultado = procesador.procesarPago(tarjetaDebito,monto);
        System.out.println(resultado);
        //Entonces
        assertEquals(resultado,resultadoEsperado);
    }
    @Test
    public void procesarPagoCreditoPositivo(){
        Tarjeta tarjetaCredito = new TarjetaCredito("123",391,2025,200.00,5000.0);
        Procesador procesador = new ProcesadorCredito(400.00);
        Double monto = procesador.getMonto();
        String resultadoEsperado = "El pago pudo ser procesado correctamente, tu saldo disponible es: " + 4400.00;
        //CUANDO
        String resultado = procesador.procesarPago(tarjetaCredito,monto);
        System.out.println(resultado);
        //Entonces
        assertEquals(resultado,resultadoEsperado);
    }
    @Test
    public void procesarPagoCreditoNegativo(){
        Tarjeta tarjetaCredito = new TarjetaCredito("123",391,2025,2000.00,5000.0);
        Procesador procesador = new ProcesadorCredito(4000.00);
        Double monto = procesador.getMonto();
        String resultadoEsperado = "El pago no pudo ser procesado";
        //CUANDO
        String resultado = procesador.procesarPago(tarjetaCredito,monto);
        System.out.println(resultado);
        //Entonces
        assertEquals(resultado,resultadoEsperado);
    }
    @Test
    public void procesarPagoNegativoFecha(){
        Tarjeta tarjetaDebito = new TarjetaDebito("123",391,2020,5000.00);
        Procesador procesador = new ProcesadorDebito(400.00);
        Double monto = procesador.getMonto();
        String resultadoEsperado = "El pago no pudo ser procesado correctamente";
        //CUANDO
        String resultado = procesador.procesarPago(tarjetaDebito,monto);
        System.out.println(resultado);
        //Entonces
        assertEquals(resultado,resultadoEsperado);
    }


}