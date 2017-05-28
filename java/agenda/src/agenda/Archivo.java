/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.File;
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
public class Archivo implements Serializable {

    private String path;
   File archivo= null;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.archivo = new File(path);
        this.path = path;
    }

    public void addPersonas(HashSet<Persona> nuevasPersona) {
        HashSet<Persona> todasLasPersonas = this.readPersonas();
        todasLasPersonas.addAll(nuevasPersona);
        
        
        this.writeListaPersonas(todasLasPersonas);
    }

    public void writeListaPersonas(HashSet<Persona> lista) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            System.out.println("Archivo guardado en:" + path);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HashSet<Persona> readPersonas() {
        HashSet<Persona> lista = new HashSet<>();

        if (!archivo.exists()) {
            return lista;
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            System.out.println("Leyendo el fichero:" + path);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                lista = (HashSet<Persona>) ois.readObject();
            }

        } catch (Exception ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception ex) {
                    Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }

    /*
     public void exampleTryCath(){
     Object recurso = null;
     try{
     recurso = asdfasdf;
     //...
     } catch(Exception e){
        
     } finally {
     if(recurso != null) recurso.close()
     }
     }
     */
}
