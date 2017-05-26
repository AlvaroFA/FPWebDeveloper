/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author Tzunfo
 */
public class cliente {

    String id;
    String pass;
    boolean esPremium;

    public cliente(String id, String pass, boolean esPremium) {
        this.id = id;
        this.pass = pass;
        this.esPremium = esPremium;
    }

    public cliente() {
    }

    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

}
