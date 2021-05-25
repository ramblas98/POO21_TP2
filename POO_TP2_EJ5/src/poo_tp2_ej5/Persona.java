
package poo_tp2_ej5;


public class Persona {
    private String nombre;
    private String apellidos;
    private int dni;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}
