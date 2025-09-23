package Ut2Practica2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Robin
 */
public class Practica2Ej1 {

    public static void main(String[] args) {

        String dni, nombre, apellido, fechaNac, telefono;

        File archivoTexto = new File("src/Ut2Practica2/archivoTexto.txt");

        try {

            if (!archivoTexto.exists()) {
                archivoTexto.createNewFile();
            }

            Scanner entrada = new Scanner(System.in);

            try (FileWriter escribir = new FileWriter(archivoTexto)) {
                System.out.print("Introduzca su DNI: ");
                dni = entrada.nextLine();
                escribir.write(dni + "|");
                
                System.out.print("Introduzca su Nombre:");
                nombre = entrada.nextLine();
                escribir.write(nombre + "|");
                
                System.out.print("Introduzca su Apellido:");
                apellido = entrada.nextLine();
                escribir.write(apellido + "|");
                
                System.out.print("Introduzca su Fecha de Nacimiento:");
                fechaNac = entrada.nextLine();
                escribir.write(fechaNac + "|");
                
                System.out.print("Introduzca su Telefono:");
                telefono = entrada.nextLine();
                escribir.write(telefono);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("");

        try {

            try (FileReader lector = new FileReader(archivoTexto)) {
                int caracter;
                
                while ((caracter = lector.read()) != -1) {
                    System.out.print((char) caracter);
                }
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

}
