import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main (String[] args) throws Exception {

        String url ="jdbc:h2:~/clase11";
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection(url,"Javier","1234");
        Statement stmt = connection.createStatement();

        String createTable = "DROP TABLE IF EXISTS EMPLEADOS; CREATE TABLE EMPLEADOS(ID INT PRIMARY KEY, NOMBRE VARCHAR(20), EMPRESA VARCHAR(20))";
        stmt.execute(createTable);

        String insertarDatos = "INSERT INTO EMPLEADOS VALUES(1,'Javier', 'NULL')";
        stmt.execute(insertarDatos);

        String insertarEmpresa1 = "INSERT INTO EMPLEADOS(ID,EMPRESA) VALUES (2,'Digital')";
        String insertarEmpresa2 = "INSERT INTO EMPLEADOS(ID,EMPRESA) VALUES (3,'Google')";
        String insertarEmpresa3 = "INSERT INTO EMPLEADOS(ID,EMPRESA) VALUES (4,'Facebook')";
        stmt.execute(insertarEmpresa1);
        stmt.execute(insertarEmpresa2);
        stmt.execute(insertarEmpresa3);

        String sql = "SELECT * FROM EMPLEADOS";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            System.out.println(     rs.getInt(1) + rs.getString(2) + rs.getString(3));
        }

    }
}