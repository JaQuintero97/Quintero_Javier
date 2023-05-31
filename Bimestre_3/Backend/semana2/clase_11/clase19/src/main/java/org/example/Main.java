package org.example;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contacto> listadoContactos = new ArrayList<>();

        Contacto contacto1 = new Contacto("Javier","jaqp.97@gmail.com","1155205893");
        Contacto contacto2 = new Contacto("Martina","martina@gmail.com","1155456585");
        Contacto contacto3 = new Contacto("Maria","maria@gmail.com","115558763");
        Contacto contacto4 = new Contacto("Samuel","samuel@gmail.com","1155781236");

        listadoContactos.add(contacto1);
        listadoContactos.add(contacto2);
        listadoContactos.add(contacto3);
        listadoContactos.add(contacto4);

        FileOutputStream fos;
        try{
            fos = new FileOutputStream("contactos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listadoContactos);
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

     ArrayList<Contacto> contactosRecuperados = null;
        FileInputStream fis;
        try{
            fis = new FileInputStream("contactos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            contactosRecuperados = (ArrayList)ois.readObject();
            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (Contacto contacto:contactosRecuperados) {
            System.out.println(contacto);
        }
    }
}