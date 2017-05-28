/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Tzunfo
 */
public class NewClass {
    String a = mostrt("soy un atributo");
    public NewClass(String a){
        mostrt(a);
        this.a=a;
    }
    
    
    public String mostrt(String s) {
        System.out.println(s);
        return s;
    }

    public void setA(String a) {
        mostrt(a);
        this.a = a;
    }
    
    
    
    public static void main(String[] args) {
        NewClass n = new NewClass("soy un constructor");
        n.setA("soy un setter");
    }
}
