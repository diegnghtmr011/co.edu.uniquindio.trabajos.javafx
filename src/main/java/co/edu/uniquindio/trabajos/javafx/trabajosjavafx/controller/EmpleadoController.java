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
import javafx.scene.control.ComboBox;
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
    private ComboBox<Direccion> cbDireccion;

    @FXML
    private ComboBox<Telefono> cbTelefono;

    @FXML
    private ComboBox<Contacto> cbContactos;
    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtNombre;


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
        Empleado empleado = new EmpleadoBuilder()
                .setNombre(txtNombre.getText())
                .setEdad(Integer.parseInt(txtEdad.getText()))
                .setTipoGenero(TipoGenero.valueOf(txtGenero.getText().toUpperCase()))
                .setDireccion(cbDireccion.getValue()) // Obtén la dirección seleccionada
                .setTelefono(cbTelefono.getValue()) // Obtén el teléfono seleccionado
                // Aquí necesitarás ajustar cómo manejas la selección múltiple de contactos
                .build();
        txtResultado.setText(empleado.toString());
    }
}
