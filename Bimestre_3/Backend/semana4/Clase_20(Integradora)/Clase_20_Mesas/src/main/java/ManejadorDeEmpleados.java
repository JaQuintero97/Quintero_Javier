import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

public class ManejadorDeEmpleados {
    public static void guardarEmpleadosTxt(List<Empleado> empleados){
        //necesito guardar empleados no usando ObjectOutStream
        FileOutputStream fos= null;
        try{
            //instanciar el objeto fos
            fos= new FileOutputStream("empleados.txt");
            //buffer
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            for (Empleado empleado:empleados) {
                //voy a preparar la linea para enviar
                String lineaAEnviar=empleado.getNombre()+";"+empleado.getApellido()+";"+empleado.getLegajo()+";"+empleado.getSueldo()+"\n";
                bos.write(lineaAEnviar.getBytes());
            }
            bos.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
