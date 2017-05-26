/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tzunfo
 */
public class archivo implements Serializable {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void writeFile(HashSet<Persona> lista) {
        try {
            FileOutputStream fos = new FileOutputStream(path, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            System.out.println("Archivo guardado en:" + path);
        } catch (IOException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HashSet<Persona> readFile() throws ClassNotFoundException {
        HashSet<Persona> lista = new HashSet<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            System.out.println("Leyendo el fichero:" + path);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                lista = (HashSet<Persona>) ois.readObject();
            }
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
