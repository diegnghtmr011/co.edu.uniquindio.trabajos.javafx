package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Direccion;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.services.IBuilder;

public class DireccionBuilder implements IBuilder<Direccion> {
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;

    public DireccionBuilder setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public DireccionBuilder setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public DireccionBuilder setPais(String pais) {
        this.pais = pais;
        return this;
    }

    public DireccionBuilder setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }

    @Override
    public Direccion build() {
        return new Direccion(direccion, ciudad, pais, codigoPostal);
    }
}
