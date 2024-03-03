package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Contacto;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Direccion;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Empleado;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Telefono;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.ContactoBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.DireccionBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.TelefonoBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoGenero;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoTelefono;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private TextField txtContactos;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarEmpleado(ActionEvent event) {
        agregarEmpleado();
    }

    @FXML
    void initialize() {
    }

    private void agregarEmpleado() {
        Direccion direccion = new DireccionBuilder().setDireccion(txtDireccion.getText()).build();
        Telefono telefono = new TelefonoBuilder().setNumeroTelefono(txtTelefono.getText()).build();
        List<Contacto> contactos = convertirTextoAContactos(txtContactos.getText());

        Empleado empleado = new EmpleadoBuilder()
                .setNombre(txtNombre.getText())
                .setEdad(Integer.parseInt(txtEdad.getText()))
                .setTipoGenero(TipoGenero.valueOf(txtGenero.getText().toUpperCase()))
                .setDireccion(direccion) // Utiliza el objeto direccion
                .setTelefono(telefono) // Utiliza el objeto telefono
                .setListaContactos(contactos) // Utiliza la lista de objetos contactos
                .build();

        txtResultado.setText(empleado.toString());
    }

    private List<Contacto> convertirTextoAContactos(String textoContactos) {
        List<Contacto> contactos = new ArrayList<>();
        for (String contactoInfo : textoContactos.split(";")) {
            String[] detalles = contactoInfo.split(",");
            if (detalles.length >= 4) {
                Telefono telefonoContacto = new TelefonoBuilder()
                        .setNumeroTelefono(detalles[1])
                        .setTipoTelefono(TipoTelefono.valueOf(detalles[2].toUpperCase()))
                        .build();
                Direccion direccionContacto = new DireccionBuilder()
                        .setDireccion(detalles[3]) // Ajusta según sea necesario
                        .build();
                Contacto contacto = new ContactoBuilder()
                        .setNombre(detalles[0])
                        .setTelefono(telefonoContacto)
                        .setDireccion(direccionContacto)
                        .build();
                contactos.add(contacto);
            }
        }
        return contactos;
    }
}
