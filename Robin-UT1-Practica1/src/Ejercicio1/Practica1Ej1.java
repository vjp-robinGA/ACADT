package Ejercicio1;

import java.io.File;
import java.io.IOException;

/**
 * @author Robin
 */
public class Practica1Ej1 {

    public static void main(String[] args) throws IOException {

        String ruta = "src/Ejercicio1/";
        String nombre = "file001.txt";
        File f = new File(ruta + nombre);

        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta: " + f.getAbsolutePath());
        System.out.println("Directorio Padre: " + f.getParent());

        try {

            f.createNewFile();

        } catch (IOException e) {

            e.printStackTrace();

        }

        if (f.exists()) {

            System.out.println("¡El fichero existe!");
            System.out.println("Permisos(rwx)-> " + f.canRead() + f.canWrite() + f.canExecute());
            System.out.println("Longitud del fichero: " + f.length() + " bytes");

        } else {

            System.out.println("El fichero no existe");

        }

    }

}
