package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Empleado;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.Empresa;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.services.IBuilder;

import java.util.Collection;
import java.util.LinkedList;

public class EmpresaBuilder implements IBuilder<Empresa> {
    private String nombre;
    private Collection<Empleado> listaEmpleados = new LinkedList<>();

    public EmpresaBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EmpresaBuilder setListaEmpleados(Empleado empleado) {
        this.listaEmpleados.add(empleado);
        return this;
    }

    public EmpresaBuilder setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados.addAll(listaEmpleados);
        return this;
    }

    @Override
    public Empresa build() {
        return new Empresa(nombre, listaEmpleados);
    }
}
