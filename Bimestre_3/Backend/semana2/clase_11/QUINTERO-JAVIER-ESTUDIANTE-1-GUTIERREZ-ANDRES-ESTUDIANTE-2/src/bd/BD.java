package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private final static String DRIVER="org.h2.Driver";
    private final static String URL="jdbc:h2:~/evaluacion1";
    private final static String USER="evaluacion1";
    private final static String PASS="evaluacion1";

    private final static String SQL_DROP_CREATE="DROP TABLE IF EXISTS ODONTOLOGOS;"+
            "CREATE TABLE ODONTOLOGOS(ID INT PRIMARY KEY," +
            "MATRICULA VARCHAR(20) NOT NULL, NOMBRE VARCHAR(30) NOT NULL, APELLIDO VARCHAR(30) NOT NULL)";

    private final static String SQL_DATOS="INSERT INTO ODONTOLOGOS VALUES(1,'1234','JAVIER','QUINTERO')," +
            "(2,'4567','ANDRES','GUTIERREZ')";

    public static Connection getConnection() throws Exception{
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL,USER,PASS);
    }

    public static void crearTabla(){
        Connection connection=null;
        try{
            connection=getConnection();
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            statement.execute(SQL_DATOS);
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

