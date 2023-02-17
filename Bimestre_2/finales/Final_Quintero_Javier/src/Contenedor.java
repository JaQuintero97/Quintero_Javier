import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{

    private List<Carga> cargaList;
    private Double pesoContenedor;

    public Contenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        cargaList = new ArrayList<>();
    }

    public void agregarCarga(Carga carga){
        cargaList.add(carga);
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotal = 0.0;
        for (Carga carga : cargaList) {
            pesoTotal += carga.calcularPeso();
        }
        return pesoTotal + pesoContenedor;
    }
}

