public class Mensuales extends Contrato{
    private double salario;
    private int horasTotales;
    private String cargo;

    public Mensuales(Empleado empleado, int mesesDuracion, String fechaInicio, Boolean sellado, double salario, int horasTotales, String cargo) {
        super(empleado, mesesDuracion, fechaInicio, sellado);
        this.salario = salario;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public Boolean esJefe(){
        return cargo == "Jefe";
    }

}
