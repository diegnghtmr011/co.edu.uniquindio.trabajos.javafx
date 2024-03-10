package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.factory;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Contacto;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Empresa;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.EmpresaBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoGenero;

import java.util.Collection;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private Empresa empresa;

    private ModelFactory() {
        empresa = new EmpresaBuilder().build();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public boolean crearEmpleado(int edad, String nombre, TipoGenero tipoGenero,
                                 String direccion, String telefono, int salario,
                                 String cedula,
                                 Collection<Contacto> listaContactos) {
        return empresa.crearEmpleado(edad, nombre, tipoGenero, direccion, telefono,
                salario, cedula, listaContactos);
    }
}
