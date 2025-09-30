package Ejercicio1;

import java.io.File;

/**
 * @author Robin
 */
public class Practica1Ej3 {

    public static void main(String args[]){
        
        File original = new File("src/Ejercicio1/2DAM/AD/P1.txt");
        
        File renombrar = new File("src/Ejercicio1/2DAM/AD/practica1.txt");
        
        original.renameTo(renombrar);
        
    }

}
