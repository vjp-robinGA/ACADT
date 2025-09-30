package Ut2Practica2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Robin
 */
public class Practica2Ej2 {

    public static int pedirNumero() {

        int numIntroducido;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un numero entero: ");
        numIntroducido = entrada.nextInt();

        return numIntroducido;

    }

    public static void main(String args[]) {

        File archivoNumeros = new File("src/Ut2Practica2/archivoNumeros.txt");

        int numero, total = 0;
        boolean fin = false;

        try {

            if (!archivoNumeros.exists()) {
                archivoNumeros.createNewFile();
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {

            try (FileWriter escribir = new FileWriter(archivoNumeros)) {
                do {

                    numero = pedirNumero();

                    if (numero == 0) {
                        fin = true;
                    } else {

                        escribir.write(numero);

                    }

                } while (fin != true);
            }

        } catch (IOException e2) {
            e2.printStackTrace();
        }

        System.out.println("");

        try {

            try (FileReader lector = new FileReader(archivoNumeros)) {
                int caracter;

                while ((caracter = lector.read()) != -1) {
                    System.out.println(caracter);

                    total += caracter;
                }
            }
            
            System.out.print("\nTotal: " + total);

        } catch (IOException e3) {
            e3.printStackTrace();
        }

    }

}
