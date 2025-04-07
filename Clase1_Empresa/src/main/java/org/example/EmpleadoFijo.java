package org.example;

public class EmpleadoFijo extends Empleado{

    private double sueldoFijo;

    public EmpleadoFijo(String nombre, String apellido, int edad, double sueldoFijo) {
        super(nombre, apellido, edad);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return sueldoFijo;
    }

}
