public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Mauricio", "Diaz",4526335,55);
        Empleado empleado1 = new Empleado("Ariel", "Bassi",2153856,36);
        Empleado empleado2 = new Empleado("Luis", "Mora",2865325,47);
        Empleado empleado3 = new Empleado("Esteban", "Reinaldi",1854252,21);

        Mensuales empMensual1 = new Mensuales(empleado,33,"15/3/99",true,458.6,55,"Jefe");
        Mensuales empMensual2 = new Mensuales(empleado1,18,"15/3/09",false,258.6,55,"Empleado");
        SalarioXHoras xhoras1 = new SalarioXHoras(empleado2,8,"25/6/11",true,84,45.4);
        SalarioXHoras xhoras2 = new SalarioXHoras(empleado3,72,"15/08/18",true,44,71.2);

        System.out.println(empMensual2.estaSellado());
        System.out.println(empMensual1.esJefe());
        System.out.println(xhoras1.compareTo(xhoras2));

    }
}