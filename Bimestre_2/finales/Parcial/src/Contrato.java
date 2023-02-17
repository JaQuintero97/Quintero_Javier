public abstract class Contrato {
    private Empleado empleado;
    private int mesesDuracion;
    private String fechaInicio;
    private Boolean sellado;

    public Contrato(Empleado empleado, int mesesDuracion, String fechaInicio, Boolean sellado) {
        this.empleado = empleado;
        this.mesesDuracion = mesesDuracion;
        this.fechaInicio = fechaInicio;
        this.sellado = sellado;
    }

    public Boolean estaSellado(){
        return sellado;
    }
}
