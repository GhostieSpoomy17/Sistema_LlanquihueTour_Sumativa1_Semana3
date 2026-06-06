package model;


public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private Direccion direccion;

    public Persona(String nombre, String apellido, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                "\nRUT: " + rut +
                "\nDirección: " + direccion;
    }
}
