package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.controller;


import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ResourceBundle;


import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Contacto;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Empleado;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.ContactoBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoGenero;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EmpleadoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEdad;

    @FXML
    private ComboBox<TipoGenero> cbxGenero;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextArea txtResultado;

    @FXML
    private RadioButton rbEmpleadoPlanta;

    @FXML
    private RadioButton rbEmpleadoTemporal;

    @FXML
    private TextField txtNombreContacto;

    @FXML
    private TextField txtTelefonoContacto;

    @FXML
    void onAgregarEmpleado(ActionEvent event) {
        agregarEmpleado();
    }


    @FXML
    void initialize() {
        cbxGenero.setItems(FXCollections.observableArrayList(TipoGenero.values()));
    }

    private int determinarSalario() {
        if (rbEmpleadoPlanta.isSelected()) {
            return 10_000_000;
        } else if (rbEmpleadoTemporal.isSelected()) {
            return 3_000_000;
        }
        return 0;
    }

    private Contacto crearContacto() {
        return new ContactoBuilder()
                .setNombre(txtNombreContacto.getText())
                .setTelefono(txtTelefonoContacto.getText())
                .build();
    }

    private void agregarEmpleado() {
        Collection<Contacto> contactos = new LinkedList<>();
        contactos.add(crearContacto());

        Empleado empleado = new EmpleadoBuilder()
                .setNombre(txtNombre.getText())
                .setEdad(Integer.parseInt(txtEdad.getText()))
                .setTipoGenero(cbxGenero.getValue())
                .setDireccion(txtDireccion.getText())
                .setTelefono(txtTelefono.getText())
                .setSalario(determinarSalario())
                .setListaContactos(contactos)
                .build();

        txtResultado.setText(empleado.toString());
    }

}
