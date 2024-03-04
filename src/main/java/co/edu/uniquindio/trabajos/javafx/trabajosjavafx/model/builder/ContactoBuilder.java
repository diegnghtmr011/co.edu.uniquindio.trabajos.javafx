package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Contacto;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.services.IBuilder;

public class ContactoBuilder implements IBuilder<Contacto> {
    private String nombre;
    private String telefono;

    public ContactoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ContactoBuilder setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    @Override
    public Contacto build() {
        return new Contacto(nombre, telefono);
    }
}
