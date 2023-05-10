import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> grupo;

    public Grupo(){
        grupo = new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        if (persona.checkEdad() && persona.checkEdadPosible() && persona.checkLetras() && persona.cantLetras() ){
            grupo.add(persona);
        }
    }
    
    public int cantidadPersonas(){
        return grupo.size();
    }
}

