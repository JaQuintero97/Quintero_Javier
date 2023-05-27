package Test;

import bd.BD;
import dao.OdontologoDAOArrayList;
import dao.OdontologoDAOH2;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    @Test
    public void listarTodosH2(){
        //DADO
        BD.crearTabla();
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());
        //CUANDO
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Integer tamanoEsperado = odontologos.size();
        //ENTONCES
        Assertions.assertEquals(2,tamanoEsperado);
    }
    @Test
    public void listarTodosArray(){
        //DADO
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOArrayList());
        Odontologo odontologo1 = new Odontologo(1,"1234","Javier","Quintero");
        Odontologo odontologo2 = new Odontologo(2,"4567","Andrés","Gutierrez");
        //CUANDO
        odontologoService.guardaOdontologo(odontologo1);
        odontologoService.guardaOdontologo(odontologo2);
        Integer resultadoEsperado = odontologoService.listarOdontologos().size();
        //ENTONCES
        Assertions.assertEquals(2,resultadoEsperado);
    }
}