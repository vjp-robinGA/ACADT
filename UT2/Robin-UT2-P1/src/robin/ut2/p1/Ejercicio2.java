package robin.ut2.p1;

import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import javax.xml.parsers.*;
import java.io.*;

/**
 * @author Robin
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            DOMImplementation implementacion = builder.getDOMImplementation();
            Document registroContactos = implementacion.createDocument(null, "contactos", null);

            registroContactos.setXmlVersion("1.0");
            
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        }
        
    }

}
