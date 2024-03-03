package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model;

public class Direccion {
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;

    public Direccion(String direccion, String ciudad, String pais, String codigoPostal) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public Direccion() {
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
