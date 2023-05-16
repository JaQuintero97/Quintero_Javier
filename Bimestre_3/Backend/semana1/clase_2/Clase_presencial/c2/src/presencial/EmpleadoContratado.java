package presencial;

public class EmpleadoContratado extends Empleado{
    private int cantHoras;
    private double valorHora;

    public EmpleadoContratado(String nombre, String apellido, String nroCuenta, int cantHoras, double valorHora) {
        super(nombre, apellido, nroCuenta);
        this.cantHoras = cantHoras;
        this.valorHora = valorHora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
