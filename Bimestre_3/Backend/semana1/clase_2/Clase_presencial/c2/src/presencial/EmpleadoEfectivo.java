package presencial;

public class EmpleadoEfectivo extends Empleado {
    private int sueldoBasico;
    private int premios;
    private int descuentos;

    public EmpleadoEfectivo(String nombre, String apellido, String nroCuenta, int sueldoBasico, int premios, int descuentos) {
        super(nombre, apellido, nroCuenta);
        this.sueldoBasico = sueldoBasico;
        this.premios = premios;
        this.descuentos = descuentos;
    }

    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }
}
