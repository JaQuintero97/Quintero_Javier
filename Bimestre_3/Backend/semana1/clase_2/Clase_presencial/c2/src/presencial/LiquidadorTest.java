package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void deberiaEmitirUnDocumentoDigitalParaUnEmpleadoEfectivo(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martín", "Martini", "001A", 400, 60, 40);
        String restultadoEsperado = "La liquidación generada es un documento impreso. Saldo a liquidar: 420.0 Deposito en la cuenta 001A";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        assertEquals(restultadoEsperado, resultado);
    }

    @Test
    public void deberiaEmitirUnDocumentoImpresoParaUnEmpleadoContratado(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoContratado();
        Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini", "001B", 120, 7);
        String restultadoEsperado = "La liquidación generada es un documento digital. Saldo a liquidar: 840.0 Deposito en la cuenta 001B";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        assertEquals(restultadoEsperado, resultado);
    }

    @Test
    public void deberiaRetornarUnMensajeDeErrorCuandoNoSePuedeLiquidarUnEmpleado(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini", "001B", 120, 7);
        String restultadoEsperado = "La liquidación no pudo ser calculada";

        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);

        //ENTONCES
        assertEquals(restultadoEsperado, resultado);
    }
}