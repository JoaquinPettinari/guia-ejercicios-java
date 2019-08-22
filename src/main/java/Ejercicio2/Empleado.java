package Ejercicio2;

public class Empleado {
    String nombre;
    String apellido;
    int dni;
    String email;
    int sueldoBase;

    public Empleado(int dni, String nombre, String apellido, String email, int sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }


}
