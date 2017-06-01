/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjuneexam.models;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Alumn extends Person implements Serializable{

    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Alumn(String dni, String name, String surName, String course) {
        super(dni, name, surName);
        this.course = course;
    }

    public Alumn() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.getSurName());
        hash = 67 * hash + Objects.hashCode(this.getName());
        hash = 67 * hash + Objects.hashCode(this.getDni());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumn other = (Alumn) obj;
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        return true;
    }
    
    
}
