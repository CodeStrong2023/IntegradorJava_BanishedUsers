package domain;

// Definimos Clase Usuario con sus set y get
public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
        
    public Usuario(String nombre, String apellido, int edad, String domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = domicilio;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String domicilio) {
        this.direccion = domicilio;
    }
}

