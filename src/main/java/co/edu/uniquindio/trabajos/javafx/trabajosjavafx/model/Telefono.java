package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoTelefono;

public class Telefono {
    private String numeroTelefono;
    private TipoTelefono tipoTelefono;

    public Telefono(String numeroTelefono, TipoTelefono tipoTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.tipoTelefono = tipoTelefono;
    }

    public Telefono() {
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public TipoTelefono tipoTelefono() {
        return tipoTelefono;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                ", tipoTelefono=" + tipoTelefono +
                '}';
    }
}
