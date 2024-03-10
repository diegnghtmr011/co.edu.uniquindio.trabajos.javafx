package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model;

import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.trabajos.javafx.trabajosjavafx.model.enums.TipoGenero;

import java.util.Collection;
import java.util.Collections;

public class Empresa {
    private String nombre;
    private Collection<Empleado> listaEmpleados;

    public Empresa(String nombre, Collection<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Empleado> getListaEmpleados() {
        return Collections.unmodifiableCollection(listaEmpleados);
    }

    public void agregarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", listaEmpleados=" + listaEmpleados +
                '}';
    }

    private Empleado obtenerEmpleado(String cedula) {
        return getListaEmpleados().stream()
                .filter(empleado -> empleado.getCedula().equalsIgnoreCase(cedula))
                .findFirst()
                .orElse(null);
    }

    private Empleado getBuildEmpleado(int edad, String nombre, TipoGenero tipoGenero,
                                      String direccion, String telefono, int salario,
                                      String cedula,
                                      Collection<Contacto> listaContactos) {
        return new EmpleadoBuilder()
                .setEdad(edad)
                .setNombre(nombre)
                .setTipoGenero(tipoGenero)
                .setDireccion(direccion)
                .setTelefono(telefono)
                .setSalario(salario)
                .setCedula(cedula)
                .setListaContactos(listaContactos)
                .build();
    }

    public boolean crearEmpleado(int edad, String nombre, TipoGenero tipoGenero,
                                 String direccion, String telefono, int salario,
                                 String cedula,
                                 Collection<Contacto> listaContactos) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedula);

        if(empleadoEncontrado == null){
            Empleado empleado = getBuildEmpleado(edad, nombre, tipoGenero,
                    direccion, telefono, salario, cedula, listaContactos);
            agregarEmpleado(empleado);
            return true;
        }
        else {
            return false;
        }
    }
}
