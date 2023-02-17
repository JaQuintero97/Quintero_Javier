import java.util.ArrayList;
import java.util.List;

public class Barco {
    private List<Carga> cargaList;

    public Barco() {
        cargaList = new ArrayList<>();
    }

    public void agregarCarga(String codigo){
        try {
            cargaList.add(CargaFactory.getInstance().generarCarga(codigo));
        } catch (CargaFactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarCargas(){
        for (Carga carga : cargaList) {
             System.out.println(carga);
        }
    }
}
