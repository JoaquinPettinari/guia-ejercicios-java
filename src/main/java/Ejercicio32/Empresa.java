package Ejercicio32;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected List<Empleado> empleados;
    String nombre;
    String anioFundacion;

    public Empresa() {this.empleados = new ArrayList<>(); }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(String anioFundacion) {
        this.anioFundacion = anioFundacion;
    }
}
