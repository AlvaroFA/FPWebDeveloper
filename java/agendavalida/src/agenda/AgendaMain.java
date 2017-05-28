
package agenda;

import java.io.IOException;

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
        Archivo a = new Archivo();
        a.setPath("./test.ser");
        a.readPersonas();
    }
}
