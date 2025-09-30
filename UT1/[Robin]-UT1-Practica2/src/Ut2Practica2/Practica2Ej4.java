package Ut2Practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Robin
 */
public class Practica2Ej4 {

    public static int mostrarMenu() {

        int opcion;

        Scanner entrada = new Scanner(System.in);

        System.out.print("[Menu de opciones]"
                + "1. Crear Usuario."
                + "2. Mostrar Todos los Usuarios."
                + "3. Mostrar los Primeros [N] Usuarios."
                + "4. Mostrat Usuario por DNI."
                + "5. Salir."
                + "\n"
                + "Opcion: ");

        opcion = entrada.nextInt();

        return opcion;

    }

    public static void crearUsuario(File archivo, FileWriter escribir, BufferedWriter buffEscribir) {

        String dni, nombre, apellido, fechaNac, telefono;

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Introduzca su DNI: ");
            dni = entrada.nextLine();
            buffEscribir.write(dni + "|");

            System.out.print("Introduzca su Nombre:");
            nombre = entrada.nextLine();
            buffEscribir.write(nombre + "|");

            System.out.print("Introduzca su Apellido:");
            apellido = entrada.nextLine();
            buffEscribir.write(apellido + "|");

            System.out.print("Introduzca su Fecha de Nacimiento:");
            fechaNac = entrada.nextLine();
            buffEscribir.write(fechaNac + "|");

            System.out.print("Introduzca su Telefono:");
            telefono = entrada.nextLine();
            buffEscribir.write(telefono);
        } catch (IOException ex1) {
            ex1.printStackTrace();
        }

    }

    public static void mostrarTodos(File archivo, FileReader lector, BufferedReader buffLector) {

        String linea;

        try {
            
            while ((linea = buffLector.readLine()) != null) {

                System.out.println(linea);
                
            }

        } catch (IOException ex2) {
            ex2.printStackTrace();
        }

    }

    public static void main(String args[]) {

        File archivoUsuarios = new File("src/Ut2Practica2/archivoUsuarios.txt");
        
        int opcionMenu;

        try {

            if (!archivoUsuarios.exists()) {
                archivoUsuarios.createNewFile();
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {

            FileWriter escribir = new FileWriter(archivoUsuarios);
            BufferedWriter buffEscribir = new BufferedWriter(escribir);

        } catch (IOException e2) {
            e2.printStackTrace();
        }

        try {

            FileReader lector = new FileReader(archivoUsuarios);
            BufferedReader buffLector = new BufferedReader(lector);

        } catch (IOException e3) {
            e3.printStackTrace();
        }
        
        do{
            opcionMenu = mostrarMenu();
            
            switch(opcionMenu){
                
            }
        }while(opcionMenu != 5);

    }

}
