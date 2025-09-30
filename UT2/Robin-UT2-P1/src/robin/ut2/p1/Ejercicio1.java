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
public class Ejercicio1 {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();

            DOMImplementation implementacion = builder.getDOMImplementation();
            Document registroEmpleados = implementacion.createDocument(null, "empleados", null);

            registroEmpleados.setXmlVersion("1.0");

            
            Element empleado = registroEmpleados.createElement("empleado");
            
            registroEmpleados.getDocumentElement().appendChild(empleado);
            
            Element id = registroEmpleados.createElement("id");
            Text texto = registroEmpleados.createTextNode("01");
            id.appendChild(texto);
            
            empleado.appendChild(id);
            
            Element nombre = registroEmpleados.createElement("nombre");
            texto = registroEmpleados.createTextNode("Antonio");
            nombre.appendChild(texto);
            
            empleado.appendChild(nombre);
            
            Element apellidos = registroEmpleados.createElement("apellido");
            texto = registroEmpleados.createTextNode("Morales");
            apellidos.appendChild(texto);
            
            empleado.appendChild(apellidos);
            
            
            Source origen = new DOMSource(registroEmpleados);
            Result resultado = new StreamResult(new File ("Empleados.xml"));
            Transformer transformador = TransformerFactory.newInstance().newTransformer();
            transformador.transform(origen, resultado);
            
            Result salidaEstandar = new StreamResult(System.out);
            transformador.transform(origen, salidaEstandar);
            
        } catch (ParserConfigurationException | TransformerException ex) {
            ex.printStackTrace();
        }

    }

}
