package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOArrayList implements IDao<Odontologo> {

    private static final Logger LOGGER= Logger.getLogger(OdontologoDAOArrayList.class);
    private List<Odontologo> odontologos = new ArrayList<>();

        @Override
        public Odontologo guardar(Odontologo odontologo) {
            LOGGER.info("Guardando odontologo en el array");
             odontologos.add(odontologo);
             return odontologo;
        }

        @Override
        public List<Odontologo> listar() {
            LOGGER.info("Vamos a listar los odontologos del Array");
            return odontologos;
        }
}

