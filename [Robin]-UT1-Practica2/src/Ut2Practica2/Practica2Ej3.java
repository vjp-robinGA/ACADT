package Ut2Practica2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Robin
 */
public class Practica2Ej3 {

    public static void main(String args[]){
        
        File archivoCorreo = new File("src/Ut2Practica2/archivoCorreo.txt");
        
        String destinatario, asunto, cuerpo, fechaHora;
        
        Scanner entrada = new Scanner(System.in);
        
        try{
            
            if(!archivoCorreo.exists()){
                archivoCorreo.createNewFile();
            }
            
        }catch(IOException e1){
            e1.printStackTrace();
        }
        
        try{
            
            try (FileWriter escribir = new FileWriter(archivoCorreo)) {
                System.out.print("Introduzca el destinatario: ");
                destinatario = entrada.nextLine();
                escribir.write(destinatario + "\n");
                
                System.out.print("Introduzca el asunto del correo: ");
                asunto = entrada.nextLine();
                escribir.write(asunto + "\n");
                
                System.out.print("Introduzca el contenido del correo: ");
                cuerpo = entrada.nextLine();
                escribir.write(cuerpo + "\n");
                
                fechaHora =  LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                escribir.write(fechaHora);
            }
            
        }catch(IOException e2){
            e2.printStackTrace();
        }
        
        System.out.println("");
        
        try {

            try (FileReader lector = new FileReader(archivoCorreo)) {
                int caracter;
                
                while ((caracter = lector.read()) != -1) {
                    System.out.print((char) caracter);
                }
            }

        } catch (IOException e3) {
            e3.printStackTrace();
        }
        
    }

}
