public class CargaSimple extends Carga{
    private Double pesoCarga;
    private Boolean esRegrigerable;

    public CargaSimple(String nombre, String descripcion, Double pesoCarga, Boolean esRegrigerable) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.esRegrigerable = esRegrigerable;
    }

    @Override
    public Double calcularPeso() {
        if (esRegrigerable){
           return pesoCarga + 2.0;
        }
        return pesoCarga;
    }
}
