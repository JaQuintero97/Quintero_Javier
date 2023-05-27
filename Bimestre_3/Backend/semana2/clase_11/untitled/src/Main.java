import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
         public static void main(String[] args) throws Exception {
            Class.forName("org.h2.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:h2:"+
                    "./Database/my", "root", "myPassword");
            Statement stmt = con.createStatement();

            //Código para crear una tabla. Elimina la tabla si esta ya existe y la
            //vuelve a crear
            String createSql = "DROP TABLE IF EXISTS TEST;\n" +
                    "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
                    "INSERT INTO TEST VALUES(1, 'Hello');\n" +
                    "INSERT INTO TEST VALUES(2, 'World');\n";
            stmt.execute(createSql);

            String sqlAnimales = "CREATE TABLE ANIMAL(ID INT PRIMARY KEY,TIPO VARCHAR(20), NOMBRE VARCHAR(20);" +
                    "INSERT INTO ANIMAl VALUES(1,'Perro','Wos');" +
                    "INSERT INTO ANIMAL VALUES(2,'Gato','Kimchi');";
            stmt.execute(sqlAnimales);
             //Codigo para consultar todos los registros de la tabla TEST
            String sql = "select * from ANIMAL";
            ResultSet rd = stmt.executeQuery(sql);

            //Código para recorrer el resultado de la consulta
            while(rd.next()) {
                System.out.println("ID: " + rd.getInt(1) + "--Nombre: " + rd.getString(2));
            }
        }

    }
