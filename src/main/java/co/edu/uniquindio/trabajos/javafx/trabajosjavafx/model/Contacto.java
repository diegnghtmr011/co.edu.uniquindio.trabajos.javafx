package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model;

public class Contacto {
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;

    public Contacto(String nombre, Telefono telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion=" + direccion +
                '}';
    }
}
