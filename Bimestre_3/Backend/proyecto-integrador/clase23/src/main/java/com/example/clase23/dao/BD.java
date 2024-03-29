package com.example.clase23.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private final static String DRIVER="org.h2.Driver";
    private final static String URL="jdbc:h2:~/Proyecto";
    private final static String USER="JavierQ";
    private final static String PASS="JavierQ";

    private final static String SQL_DROP_CREATE="DROP TABLE IF EXISTS DOMICILIOS;"+
            "CREATE TABLE DOMICILIOS (ID INT AUTO_INCREMENT PRIMARY KEY," +
            "CALLE VARCHAR(100) NOT NULL, NUMERO VARCHAR(100) NOT NULL, LOCALIDAD VARCHAR(100) NOT NULL, " +
            "PROVINCIA VARCHAR(100) NOT NULL)";
    private final static String SQL_DROP_CREATE_2="DROP TABLE IF EXISTS PACIENTES;" +
            "CREATE TABLE PACIENTES (ID INT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL," +
            " APELLIDO VARCHAR(100) NOT NULL, DOCUMENTO VARCHAR(100) NOT NULL, FECHA_INGRESO DATE NOT NULL," +
            " DOMICILIO_ID INT, EMAIL VARCHAR(100) NOT NULL)";

    private final static String SQL_DROP_CREATE_3="DROP TABLE IF EXISTS ODONTOLOGOS;"+
            "CREATE TABLE ODONTOLOGOS(ID INT AUTO_INCREMENT PRIMARY KEY," +
            " NROMATRICULA VARCHAR(20) NOT NULL, NOMBRE VARCHAR(30) NOT NULL, APELLIDO VARCHAR(30) NOT NULL)";
    private final static String SQL_PRUEBA="INSERT INTO DOMICILIOS (CALLE, NUMERO, LOCALIDAD, PROVINCIA) " +
            "VALUES('CALLE210A','1234','SOURIGUES','BS AS'), ('CALLE SIEMPRE VIVA','742','SPRINFIELD',' USA'); " +
            "INSERT INTO PACIENTES (NOMBRE, APELLIDO, DOCUMENTO, FECHA_INGRESO, DOMICILIO_ID, EMAIL) VALUES('PEPE','MUJICA','123','2022-05-08',1,'jorgito@gmail.com'),('SOL','VASQUEZ','12233','2022-10-25',2,'guillermo@gmail.com')";

    private final static String SQL_DATOS_ODONTOLOGO="INSERT INTO ODONTOLOGOS (NROMATRICULA," +
            "NOMBRE,APELLIDO ) VALUES('1234','JAVIER','QUINTERO')," +
            "('4567','ANDRES','GUTIERREZ')";
    public static Connection getConnection() throws Exception{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER,PASS);
    }

    public static void crearTablas(){
        Connection connection=null;
        try{
            connection=getConnection();
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            statement.execute(SQL_DROP_CREATE_2);
            statement.execute(SQL_DROP_CREATE_3);
            statement.execute(SQL_PRUEBA);

            statement.execute(SQL_DATOS_ODONTOLOGO);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
