package src;

public class Main {

    //X12345678F, "josefina", "askldjalkaA·", +(82)12345678,612345678,test@TEST.com,(91)23456789,5858438953745893TEST.com
    static String testData = "X12345678F,\"josefina\",\"askldjalkaA·\",+(82)12345678,612345678,test@TEST.com,(91)23456789,5858438953745893TEST.com"; 

    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    //devuelve false si no se ha guardado por un error
    public static final boolean onClickSave(String data, String fichero) {

        //Recoger y formateo de datos
        Persona p = new Persona();
        p.leerDatos(data);
        //escribir xml
        XmlWriter xmlw = new XmlWriter();
        return xmlw.writeClientXML(fichero, p);
    }

}
