package presencial;

public class LiquidadorEmpleadoEfectivo extends Liquidador{
    @Override
    protected double calcularSueldo(Empleado empleado) {
        double mensajeDeRespuesta=0;
        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            double sueldoFinal = empleadoEfectivo.getSueldoBasico()+ empleadoEfectivo.getPremios() - empleadoEfectivo.getDescuentos();
            mensajeDeRespuesta = sueldoFinal;
        }
        return mensajeDeRespuesta;
    }

    @Override
    protected String imprimirRecibo(Empleado empleado) {
        return "La liquidación generada es un documento impreso.";
    }
}
