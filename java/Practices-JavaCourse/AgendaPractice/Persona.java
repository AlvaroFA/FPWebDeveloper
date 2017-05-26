

package agenda;

import java.io.Serializable;


public class Persona implements Serializable{

    private String telefono;
    private String nombre;
    private String apellidos;
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" + "telefono=" + telefono + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
}
