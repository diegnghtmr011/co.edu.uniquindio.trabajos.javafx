package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Telefono;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoTelefono;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.services.IBuilder;

public class TelefonoBuilder implements IBuilder<Telefono> {
    private String numeroTelefono;
    private TipoTelefono tipoTelefono;

    public TelefonoBuilder setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public TelefonoBuilder setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
        return this;
    }

    @Override
    public Telefono build() {
        return new Telefono(numeroTelefono, tipoTelefono);
    }
}
