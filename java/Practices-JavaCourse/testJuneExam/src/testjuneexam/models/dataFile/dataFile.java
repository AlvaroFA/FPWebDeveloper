/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjuneexam.models.dataFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;


import testjuneexam.models.Alumn;

/**
 *
 * @author alvaro
 */
public class dataFile implements Serializable {

    private String pathFile;
    File savedDataFile = null;

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.savedDataFile= new File(pathFile);
        this.pathFile = pathFile;
    }

    public void writeAlumnList(HashSet<Alumn> alumnList) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(alumnList);
            oos.close();
            fos.close();
            System.out.println("Archivo guardado en:" + pathFile);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public HashSet<Alumn> ReadAlumn() {
        HashSet<Alumn> alumnList = new HashSet<>();
        if (!savedDataFile.exists()) {
            return alumnList;
        }
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(pathFile);
            System.out.println("Reading file:" + pathFile);
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                alumnList = (HashSet<Alumn>) ois.readObject();

            }
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Error capturado en lectura de archivo");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.err.println(ex);
                }

            }
        }

        return alumnList;
    }

    public void addAlumns(HashSet<Alumn> newAlumn){
        HashSet<Alumn> allAlumns = this.ReadAlumn();
        allAlumns.addAll(newAlumn);
        this.writeAlumnList(allAlumns);
    }
}

