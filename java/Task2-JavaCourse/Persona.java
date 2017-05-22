package src;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private List<String> mails = new ArrayList<>();
    private List<String> telefonos = new ArrayList<>();
    private List<String> errores = new ArrayList<>();

    public static final String ERROR_DNI = " Posicion %d: %s no es un DNI";
    public static final String ERROR_NO_ES_TELEFONO_NI_EMAIL = "Posicion %d: %s no es ni un teléfono ni un email";
    public static final String ERROR_EMAIL_REPETIDO = "Posicion %d: El email %s está repetido";
    public static final String ERROR_TELEFONO_REPETIDO = "Posicion %d: El telefono %s está repetido";

    private Pattern _dni_expresionRegular = Pattern.compile("[XYxy]?[0-9]{1,9}[A-Za-z]$");

    Pattern _telefono_expresionRegular = Pattern.compile("^\\+?[0-9]*(\\([0-9]+\\))*[0-9]+$");

    Pattern _email_expresionRegular = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public void leerDatos(String input) {

        String[] data = input.split(",");

        if (_dni_expresionRegular.matcher(data[0]).find()) {
            this.dni = data[0].trim();
        } else {
            errores.add(String.format(ERROR_DNI, 0, data[0]));
        }

        this.nombre = data[1].replace("\"", "").trim();
        this.apellidos = data[2].replace("\"", "").trim();

        for (int i = 3; i < data.length; i++) {
            String dato = data[i].trim();
            if (_email_expresionRegular.matcher(dato).find()) {
                dato = dato.toLowerCase();

                if (mails.contains(dato)) {
                    errores.add(String.format(ERROR_EMAIL_REPETIDO, i, dato));
                } else {

                    mails.add(dato);
                }
            } else if (_telefono_expresionRegular.matcher(dato).find()) {
                if (telefonos.contains(dato)) {
                    errores.add(String.format(ERROR_TELEFONO_REPETIDO, i, dato));
                } else {
                    telefonos.add(dato);
                }
            } else {
                errores.add(String.format(ERROR_NO_ES_TELEFONO_NI_EMAIL, i, dato));
            }
        }
        
        //Ordenar telefono
        telefonos.sort(new Comparator<String>() {
            @Override
            //<0 si arg1 va primero, >0 si arg2 va después
            public int compare(String arg1, String arg2) {
                arg1 = arg1.replace("(", "").replace(")", "");
                arg2 = arg2.replace("(", "").replace(")", "");
                
                if(arg1.startsWith("+") && !arg2.startsWith("+")){
                    return 1; //arg 2 va primero, porque es nacional, y arg 1 no
                } else if(!arg1.startsWith("+") && arg2.startsWith("+")){
                    return -1; //arg 1 va primero, porque es nacional, y arg 2 no
                } else {
                    //Comparación inversa, para ordenarlos de mayor a menor
                    return arg2.compareTo(arg1);
                }
            }
        });
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public List<String> getMails() {
        return mails;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public List<String> getErrores() {
        return errores;
    }
    
    

}
