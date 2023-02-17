public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco();

        CargaFactory factory = CargaFactory.getInstance();

        barco.agregarCarga("CODIGO_TV");
        barco.agregarCarga("CODIGO_MEDICAMENTO");
        barco.agregarCarga("CODIGO_CONTENEDOR");

        barco.mostrarCargas();
    }
}