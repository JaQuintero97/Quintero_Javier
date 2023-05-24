import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static final Logger logger= Logger.getLogger(Lista.class);
    private List<Integer> listaEnteros;

    public Lista(){
        listaEnteros= new ArrayList<>();
    }
    public void agregarEnteros(Integer numero){
        if (listaEnteros.size() < 1){
            logger.error("La lista es igual a cero");
        }
        listaEnteros.add(numero);
        if(listaEnteros.size()>5 && listaEnteros.size() <= 10){
            //necesito logger, necesito guardarlo en mi vitacora
            logger.info("La lista de creada tiene :"+listaEnteros.size()+" de esta manera superamos los 5 elementos");
        } else if (listaEnteros.size()>10) {
            logger.info("La lista de creada tiene :"+listaEnteros.size()+" de esta manera superamos los 10 elementos");
        }

        Integer suma = 0;
        for (Integer numerito:listaEnteros) {
             suma += numerito;
        }

        Double promedio = (double)suma/listaEnteros.size();
        logger.info("El promedio es: " + promedio);
    }
}
