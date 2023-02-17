public class SalarioXHoras extends Contrato implements Comparable{
    private int horasContratadas;
    private Double valorHora;

    public SalarioXHoras(Empleado empleado, int mesesDuracion, String fechaInicio, Boolean sellado, int horasContratadas, Double valorHora) {
        super(empleado, mesesDuracion, fechaInicio, sellado);
        this.horasContratadas = horasContratadas;
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
        SalarioXHoras temp = (SalarioXHoras) o;
        if (this.horasContratadas > temp.horasContratadas) return 1;
        else if (this.horasContratadas  < temp.horasContratadas) return -1;
        else return 0;
    }
}
