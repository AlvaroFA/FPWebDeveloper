
package agenda;

import java.io.IOException;
import java.util.HashSet;

/**
 *
 * @author Tzunfo
 */
public class AgendaMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        archivo a = new archivo();
        a.setPath("./test.ser");
        //a.writeFile(lista);
        HashSet<Persona>personasLeidas= a.readFile();
        System.out.println(personasLeidas.toString());
    }
}
