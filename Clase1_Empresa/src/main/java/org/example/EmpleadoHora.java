package org.example;

public class EmpleadoHora extends Empleado{

    private double precioHora;
    private int horasTrabajadas;

    public EmpleadoHora(String nombre, String apellido, int edad, double precioHora, int horasTrabajadas) {
        super(nombre, apellido, edad);
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return precioHora * horasTrabajadas;
    }

}
