package repasoinicial;

import java.util.Scanner;

/**
 * @author Robin
 */
public class RepasoInicial {

    public static void main(String[] args) {

        /* Ejercicio 1: */
//        int num1, num2;
//        
//        num1 = 6;
//        num2 = 12;
//        
//        System.out.println("Suma: " + (num1 + num2) + "\nResta: " + (num1 - num2) + "\nMultiplicacion: " + (num1 * num2) + "\nDivision: " + (num1 / num2) + "\nModulo: " + (num1 % num2));
        /* Ejercicio 2: */
//        int num1, num2;
//        
//        num1 = 9;
//        num2 = 4;
//        
//        if(num1 > num2){
//            System.out.println("El numero 1 (" + num1 + ") es mayor que el numero 2 (" + num2 + ")");
//        }
//        else if(num1 == num2){
//            System.out.println("El numero 1 (" + num1 + ") es igual que el numero 2 (" + num2 + ")");
//        }
//        else if(num1 < num2){
//            System.out.println("El numero 1 (" + num1 + ") es menor que el numero 2 (" + num2 + ")");
//        }
        /* Ejercicio 3: */
//        String nombre;
//        
//        nombre = "Robin Gonzalez Anton";
//        
//        System.out.println("Bienvenido/a " + nombre);
        /* Ejercicio 4: */
//        Scanner entrada = new Scanner(System.in);
//        
//        String nombre;
//        
//        System.out.print("Introduzca su nombre: ");
//        nombre = entrada.nextLine();
//        
//        System.out.println("\nBienvenido/a " + nombre);
        /* Ejercicio 5: */
//        Scanner entrada = new Scanner(System.in);
//        
//        int numDivisible;
//        
//        System.out.print("Introduzca un numero: ");
//        numDivisible = entrada.nextInt();
//        
//        if(numDivisible % 2 == 0){
//            System.out.println("El numero es divisible entre 2");
//        }
//        else{
//            System.out.println("El numero no es divisible entre 2");
//        }
        /* Ejercicio 6: */
//        Scanner entrada = new Scanner(System.in);
//        
//        double precioTotal, numIntroducido = 0;
//        final double iva = 0.21;
//        
//        System.out.print("Introduzca el precio: ");
//        numIntroducido = entrada.nextFloat();
//        
//        precioTotal = numIntroducido + (numIntroducido * iva);
//        
//        System.out.println("Precio final: " + precioTotal);
        /* Ejercicio 7: */
//        int i=1;
//        
//        while(i <= 100){
//            System.out.println(i);
//            
//            i++;
//        }
        /* Ejercicio 8: */
//        for(int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }
        /* Ejercicio 9: */
//        int i = 1;
//        
//        while(i <= 100){
//            
//            if(i % 2 == 0){
//                if(i % 3 == 0){
//                    System.out.println(i);
//                }
//            }
//            
//            i++;
//            
//        }
        /* Ejercicio 10: */
//        int numVentas, i = 0, total=0;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.print("Introduzca el numero de ventas: ");
//        numVentas = entrada.nextInt();
//        
//        while(i < numVentas){
//            
//            System.out.print("Productos vendidos en la venta numero " + (i+1) + ": ");
//            total += entrada.nextInt();
//            
//            i++;
//            
//        }
//        
//        System.out.print("Total de productos vendidos: " + total);
        /* Ejercicio 11: */
//        double numero;
//        boolean numValido = false;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        do{
//            
//            System.out.print("Introduzca un numero mayor a 0: ");
//            numero = entrada.nextDouble();
//            
//            if(numero > 0){
//                
//                System.out.println("Numero valido (" + numero + ")");
//                
//                numValido = true;
//                
//            }
//            
//        }while(numValido == false);
        /* Ejercicio 12: */
//        final String password = "Password";
//        String intentoPassword = "";
//        int intentos = 3;
//        boolean passwordValido = false;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        do{
//            
//            System.out.print("Introduzca la contrasena: ");
//            intentoPassword = entrada.nextLine();
//            
//            if(intentoPassword.equals(password)){
//                
//                System.out.println("Enhorabuena");
//                
//                passwordValido = true;
//                
//            }
//            else{
//                
//                System.out.println("Incorrecto.");
//                
//                intentos--;
//                
//                System.out.println("Intentos restantes: " + intentos);
//                
//            }
//            
//        }while(passwordValido != true && intentos > 0);
//     
//        if(passwordValido == false){
//            
//            System.out.println("Demasiados Intentos Fallidos.");
//            
//        }
        /* Ejercicio 13: */
//        String diaSemana;
//
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.print("Introduzca un dia de la semana: ");
//        diaSemana = entrada.nextLine();
//
//        switch (diaSemana) {
//
//            case "Lunes":
//
//                System.out.println("El Lunes es un Dia Laboral");
//                break;
//
//            case "Martes":
//
//                System.out.println("El Martes es un Dia Laboral");
//                break;
//
//            case "Miercoles":
//
//                System.out.println("El Miercoles es un Dia Laboral");
//                break;
//
//            case "Jueves":
//
//                System.out.println("El Jueves es un Dia Laboral");
//                break;
//
//            case "Viernes":
//
//                System.out.println("El Viernes es un Dia Laboral");
//                break;
//
//            case "Sabado":
//
//                System.out.println("El Sabado no es un Dia Laboral");
//
//                break;
//
//            case "Domingo":
//
//                System.out.println("El Domingo no es un Dia Laboral");
//                break;
//
//            default:
//
//                System.out.println("ERROR: AEscriba el dia con mayuscula inicial y sin tildes");
//                break;
//
//        }
        /* Ejercicio 14: */
//        int num1, num2;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.print("Introduzca el primer numero: ");
//        num1 = entrada.nextInt();
//        
//        System.out.print("Introduzca el segundo numero: ");
//        num2 = entrada.nextInt();
//
//        for(int i = 0; i < 10; i++){
//            
//            System.out.println((int)(Math.floor(Math.random() * (num2 - (num1 - 1)) + num1)));
//            
//        }
        /* Ejercicio 15: */
//        int numIntroducido = 0, cifras = 0;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        do{
//            System.out.print("Introduzca un numero positivo: ");
//            numIntroducido = entrada.nextInt();
//            
//            if(numIntroducido >= 0){
//                
//                System.out.println(String.valueOf(numIntroducido).length());
//                
//            }
//            else{
//                System.out.println("Error: numero negativo");
//            }
//            
//        }while(numIntroducido < 0);
        /* Ejercicio 16: */
        int numIntroducido, contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        numIntroducido = entrada.nextInt();

        if (numIntroducido <= 0) {

            System.out.println("El numero no es primo");

        } else {

            for (int i = 2; i <= Math.sqrt(numIntroducido); i++) {

                if(numIntroducido % i == 0){
                     
                    contador++;
                    
                }
                
            }
            
            if(contador > 2){
                System.out.println("El numero no es primo");
            }
            else{
                System.out.println("El numero es primo");
            }
            
            

        }

    }

}
