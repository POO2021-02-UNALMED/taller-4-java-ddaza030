package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    static int ceduladefault;
    static {
        totalPersonas = 0;
        ceduladefault = 0;
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = ceduladefault;
        ceduladefault++;
        totalPersonas++;
    }
    
    Persona() {
        this.nombre = "";
        this.cedula = ceduladefault;
        ceduladefault++;
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
