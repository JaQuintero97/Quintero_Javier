import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void agregar5personasOkTest(){
        //Dado
        Persona juan = new Persona("Juan", 25);
        Persona pedro = new Persona("Pedro", 35);
        Persona luz = new Persona("Luz", 55);
        Persona ana = new Persona("Ana", 35);
        Persona julian = new Persona("Julian", 45);
        Grupo grupo = new Grupo();
        //Cuando
        grupo.agregarPersona(juan);
        grupo.agregarPersona(pedro);
        grupo.agregarPersona(luz);
        grupo.agregarPersona(ana);
        grupo.agregarPersona(julian);
        //Entonces
        assertTrue(grupo.cantidadPersonas()==2);
    }
    @Test
    public void agregar5personasTest(){
        //Dado
        Persona juan = new Persona("Juana", 18);
        Persona pedro = new Persona("Pedro", 17);
        Persona luz = new Persona("Lucero", 22);
        Persona ana = new Persona("Pablo", 14);
        Persona julian = new Persona("Julian", 32);
        Grupo grupo = new Grupo();
        //Cuando
        grupo.agregarPersona(juan);
        grupo.agregarPersona(pedro);
        grupo.agregarPersona(luz);
        grupo.agregarPersona(ana);
        grupo.agregarPersona(julian);
        //Entonces
        assertTrue(grupo.cantidadPersonas()==3);
    }
    @Test
    public void agregar5personasOkUltimoTest(){
        //Dado
        Persona N1c0las = new Persona("N1c0las", 25);
        Persona Tomas = new Persona("Tomas", 35);
        Persona luz = new Persona("3steban", 55);
        Persona ana = new Persona(", Carlos\\sV", 35);
        Persona julian = new Persona("Francisco\\sII", 45);
        Grupo grupo = new Grupo();
        //Cuando
        grupo.agregarPersona(N1c0las);
        grupo.agregarPersona(Tomas);
        grupo.agregarPersona(luz);
        grupo.agregarPersona(ana);
        grupo.agregarPersona(julian);
        //Entonces
        assertTrue(grupo.cantidadPersonas()==1);
    }

}