package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Contacto;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Direccion;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Telefono;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.services.IBuilder;

public class ContactoBuilder implements IBuilder<Contacto> {
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;

    public ContactoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ContactoBuilder setTelefono(Telefono telefono) {
        this.telefono = telefono;
        return this;
    }

    public ContactoBuilder setDireccion(Direccion direccion) {
        this.direccion = direccion;
        return this;
    }

    @Override
    public Contacto build() {
        return new Contacto(nombre, telefono, direccion);
    }
}
