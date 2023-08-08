package dao;

import bd.BD;
import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements IDao<Odontologo> {

    private static final Logger LOGGER= Logger.getLogger(OdontologoDAOH2.class);

    private static final String SQL_SELECT_ALL = "SELECT * FROM ODONTOLOGOS";

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        LOGGER.info("Va a empezar el guardado de un odontologo");
        Connection connection = null;
        try{
            connection = BD.getConnection();
            PreparedStatement psInsert = connection.prepareStatement("INSERT INTO ODONTOLOGOS VALUES(?,?,?,?)");
            psInsert.setInt(1,odontologo.getId());
            psInsert.setString(2,odontologo.getNroMatricula());
            psInsert.setString(3,odontologo.getNombre());
            psInsert.setString(4,odontologo.getApellido());
            psInsert.execute();
            }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        LOGGER.info("Guardado correcto de un odontologo");
        return odontologo;

    }

    @Override
    public List<Odontologo> listar() {
        LOGGER.info("Vamos a buscar todos los odontologos");
        Connection connection = null;
        List<Odontologo> odontologos = new ArrayList<>();
        Odontologo odontologo = null;
        try{
            connection = BD.getConnection();
            PreparedStatement psSelectAll = connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet rs = psSelectAll.executeQuery();
            while (rs.next()) {
                odontologo = new Odontologo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                odontologos.add(odontologo);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        LOGGER.info("Búsqueda finalizada");
        return odontologos;
    }
}

