package Ejercicio1;

import java.io.File;
import java.io.IOException;

/**
 * @author Robin
 */
public class Practica1Ej2 {

    public static void main(String args[]) {

        String rutaRaiz = "src/Ejercicio1/2DAM";
        File dirRaiz = new File(rutaRaiz);

        String rutaAcceso = "/AD";
        File accesoDatos = new File(rutaRaiz + rutaAcceso);

        String rutaPSP = "/PSP";
        File progSP = new File(rutaRaiz + rutaPSP);

        try {

            boolean correcto = dirRaiz.mkdir();

            if (correcto) {

                correcto = accesoDatos.mkdir();

                if (correcto) {

                    File p1 = new File(accesoDatos + "/P1.txt");
                    p1.createNewFile();

                    for (int i = 1; i < 3; i++) {
                        File udI = new File(accesoDatos + "/UD" + i + ".txt");
                        udI.createNewFile();
                    }

                } else {
                    System.out.println("Error al crear el directorio AD");
                }

                correcto = progSP.mkdir();

                if (correcto) {

                    for (int i = 1; i < 3; i++) {
                        File udI = new File(progSP + "/UD" + i + ".txt");
                        udI.createNewFile();
                    }

                } else {
                    System.out.println("Error al crear el directorio PSP");
                }

                File misNotas = new File(rutaRaiz + "/misNotas.txt");
                misNotas.createNewFile();

            } else {
                System.out.println("Error al crear el directorio raiz");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
