package robin.ut1.practica1;

import java.io.File;

/**
 * @author Robin
 */
public class RobinUT1Practica1 {

    public static void main(String[] args) {
     
        String ruta = "src/";
        String nombre = "file001.txt";
        File f = new File(ruta + nombre);
        
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta: " + f.getAbsolutePath());
        System.out.println("Directorio Padre: " + f.getParent());
        
        if(f.exists()){
            
            System.out.println("¡El fichero existe!");
            System.out.println("Permisos(rwx)-> " + f.canRead() + f.canWrite() + f.canExecute());
            System.out.println("Longitud del fichero: " + f.length() + " bytes");
            
        }
        else{
            
            System.out.println("El fichero no existe");
            
        }
        
    }

}
