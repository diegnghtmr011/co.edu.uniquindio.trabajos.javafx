package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoGenero;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Empleado {
    private int edad;
    private String nombre;
    private TipoGenero tipoGenero;
    private String direccion;
    private String telefono;
    private int salario;
    private String cedula;
    private Collection<Contacto> listaContactos;

    public Empleado(int edad, String nombre, TipoGenero tipoGenero,
                    String direccion, String telefono, int salario,
                    String cedula,
                    Collection<Contacto> listaContactos) {
        this.edad = edad;
        this.nombre = nombre;
        this.tipoGenero = tipoGenero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario =salario;
        this.cedula = cedula;
        this.listaContactos = new LinkedList<>(listaContactos);
    }

    public Empleado() {
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoGenero getTipoGenero() {
        return tipoGenero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getSalario() {
        return salario;
    }

    public String getCedula() {
        return cedula;
    }

    public Collection<Contacto> getListaContactos() {
        return Collections.unmodifiableCollection(listaContactos);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", tipoGenero=" + tipoGenero +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", cedula='" + cedula + '\'' +
                ", listaContactos=" + listaContactos +
                '}';
    }
}
