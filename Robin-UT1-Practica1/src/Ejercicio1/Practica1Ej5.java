package Ejercicio1;

import java.io.File;

/**
 * @author Robin
 */
public class Practica1Ej5 {

    public static void listarDirectorio(File directorio) {

        File[] archivos = directorio.listFiles();

        for (int i = 0; i < archivos.length; i++) {

            if (archivos[i].isDirectory()) {
                System.out.println("--------------------------------");
                listarDirectorio(archivos[i]);
                System.out.println("--------------------------------");
            }
            else{
                System.out.println(archivos[i]);
            }
            
        }

    }

    public static void main(String args[]) {

        File dam2 = new File("src/Ejercicio1/2DAM");
        
        listarDirectorio(dam2);
        
    }

}
