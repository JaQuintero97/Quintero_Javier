package com.example.clase23.dao;

import com.example.clase23.model.Odontologo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class OdontologoDAOH2 implements IDao<Odontologo> {

    private static final Logger LOGGER= Logger.getLogger(OdontologoDAOH2.class);

    private static final String SQL_SELECT_ALL = "SELECT * FROM ODONTOLOGOS";

    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS (NROMATRICULA,NOMBRE,APELLIDO) VALUES (?,?,?)";

    private static final String SQL_SELECT_ONE="SELECT * FROM ODONTOLOGOS WHERE ID=?";

    private static final String SQL_UPDATE="UPDATE ODONTOLOGOS SET NROMATRICULA=?, NOMBRE=?, APELLIDO=? WHERE ID=?";

    private static final String SQL_DELETE="DELETE FROM ODONTOLOGOS WHERE ID=?";
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        LOGGER.info("Iniciando la operacion de guardado de un Odontologo");
        Connection connection = null;
        try{
            connection = BD.getConnection();
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setString(1,odontologo.getNroMatricula());
            psInsert.setString(2,odontologo.getNombre());
            psInsert.setString(3,odontologo.getApellido());
            psInsert.execute();
            ResultSet rs =psInsert.getGeneratedKeys();
            while(rs.next()){
                odontologo.setId(rs.getInt(1));
            }
            }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return odontologo;

    }

    @Override
    public Odontologo buscar(Integer id) {
        Odontologo odontologo = null;
        Connection connection = null;
        try{
            connection = BD.getConnection();
            PreparedStatement ps = connection.prepareStatement(SQL_SELECT_ONE);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                odontologo = new Odontologo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return odontologo;
    }

    @Override
    public void actualizar(Odontologo odontologo) {
    LOGGER.info("Actualizando Odontologo");
    Connection connection = null;
    try{
        connection = BD.getConnection();
        PreparedStatement ps_Update = connection.prepareStatement(SQL_UPDATE);
        ps_Update.setString(1,odontologo.getNroMatricula());
        ps_Update.setString(2,odontologo.getNombre());
        ps_Update.setString(3,odontologo.getApellido());
        ps_Update.setInt(4,odontologo.getId());
        ps_Update.execute();
    }
    catch (Exception e){
        e.printStackTrace();
    }finally {
        try{
            connection.close();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    }

    @Override
    public void eliminar(Integer id) {
        Connection connection = null;
        try{
         connection = BD.getConnection();
         PreparedStatement ps_Delete = connection.prepareStatement(SQL_DELETE);
         ps_Delete.setInt(1,id);
         ps_Delete.execute();
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
        LOGGER.info("Odontologo eliminado");

    }

    @Override
    public Odontologo buscarXString(String valor) {
        return null;
    }

    @Override
    public List<Odontologo> listarTodos() {
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

