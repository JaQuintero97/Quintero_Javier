import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("1234","12345",new ArrayList<>());
        Empleado empleado1 = new Empleado("Jorgito","Pereyra",12345,100d);
        Empleado empleado2 = new Empleado("Claudio","Nasser",150,200d);
        Empleado empleado3 = new Empleado("Ramon","Ramirez",456,300d);
        Empleado empleado4 = new Empleado("Rodolfo","Juarez",351,600d);
        //Agregando
        empresa.agregarEmpelado(empleado1);
        empresa.agregarEmpelado(empleado2);
        empresa.agregarEmpelado(empleado3);
        empresa.agregarEmpelado(empleado4);


        try{
        FileOutputStream fos = new FileOutputStream("empresas.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(empresa);
        oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        Empresa empresaRecuperada = null;
        try{
            FileInputStream fis = new FileInputStream("empresas.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            empresaRecuperada = (Empresa)ois.readObject();
            System.out.println(empresaRecuperada);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
