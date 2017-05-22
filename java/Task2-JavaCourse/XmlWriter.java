package src;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Document;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;

public class XmlWriter {

    public boolean writeClientXML(String pathFichero, Persona p) {
        try {
            // Constructores del xml
            DocumentBuilderFactory xmlFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder xmlBuilder = xmlFactory.newDocumentBuilder();
            //creacion elemento raiz
            Document xmlClientDoc = xmlBuilder.newDocument();
            Element elementoRaiz = xmlClientDoc.createElement("cliente");
            xmlClientDoc.appendChild(elementoRaiz);
            //creacion elementos a agregar a la raiz
            //dni
            Element elementoDni = xmlClientDoc.createElement("dni");
            elementoDni.setTextContent(p.getDni());
            elementoRaiz.appendChild(elementoDni);
            //nombre
            Element elementoNombre = xmlClientDoc.createElement("nombre");
            elementoNombre.setTextContent(p.getNombre());
            elementoRaiz.appendChild(elementoNombre);
            //apellidos
            Element elementoApellidos = xmlClientDoc.createElement("apellidos");
            elementoApellidos.setTextContent(p.getApellidos());
            elementoRaiz.appendChild(elementoApellidos);
            //lista de telefonos
            Element elementoTelefono = xmlClientDoc.createElement("telefonos");
            elementoTelefono.setAttribute("total", String.valueOf(p.getTelefonos().size()));
            for (int i = 0; i < p.getTelefonos().size(); i++) {
                Element t = xmlClientDoc.createElement("telefono");
                t.setTextContent(p.getTelefonos().get(i));
                elementoTelefono.appendChild(t);
            }
            elementoRaiz.appendChild(elementoTelefono);
            //lista de emails
            Element elementoEmail = xmlClientDoc.createElement("emails");
            elementoEmail.setAttribute("total", String.valueOf(p.getMails().size()));

            for (int i = 0; i < p.getMails().size(); i++) {
                Element t = xmlClientDoc.createElement("email");
                t.setTextContent(p.getMails().get(i));
                elementoEmail.appendChild(t);
            }
            elementoRaiz.appendChild(elementoEmail);
            
                      //lista de emails
            Element elementoErrores = xmlClientDoc.createElement("errores");
            elementoErrores.setAttribute("total", String.valueOf(p.getErrores().size()));

            for (int i = 0; i < p.getErrores().size(); i++) {
                Element t = xmlClientDoc.createElement("error");
                t.setTextContent(p.getErrores().get(i));
                elementoErrores.appendChild(t);
            }
            elementoRaiz.appendChild(elementoErrores);
            
            
            DOMSource fichero = new DOMSource(xmlClientDoc);
            StreamResult resultado = new StreamResult(new File(pathFichero));

            //3º Establecemos algunas opciones de salida, como por ejemplo, la codificación de salida.
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(fichero, resultado);
            return true;
        } catch (ParserConfigurationException | TransformerConfigurationException ex) {
            //la exception deberia mostrarse en la gui
            Logger.getLogger(XmlWriter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            //la exception deberia mostrarse en la gui
            Logger.getLogger(XmlWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
