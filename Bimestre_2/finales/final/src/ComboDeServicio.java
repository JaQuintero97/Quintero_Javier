import java.util.ArrayList;
import java.util.List;

public class ComboDeServicio extends Servicio{

    private List<Servicio> servicioList;
    private Integer descuento;

    public ComboDeServicio(String nombre, String descripcion, List<Servicio> servicioList, Integer descuento) {
        super(nombre, descripcion);
        this.servicioList = servicioList;
        this.descuento = descuento;
        servicioList = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio){
        servicioList.add(servicio);
    }

    @Override
    public Double calcularPrecio() {
        Double total = 0.0;
        for (Servicio servicio : servicioList) {
            total += servicio.calcularPrecio();
        }
        return total - (total * descuento);
    }
}

