package Ejercicio1;

import java.io.File;

/**
 * @author Robin
 */
public class Practica1Ej4 {

    public static void main(String args[]){
        
        File dam2 = new File("src/Ejercicio1/2DAM");
        
        File[] archivos2Dam = dam2.listFiles();
        
        for(int i = 0; i < archivos2Dam.length; i++){
            System.out.println(archivos2Dam[i]);
        }
        
    }

}
