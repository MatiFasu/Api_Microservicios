package org.example;

abstract class Empleado {

    protected String nombre;
    protected String apellido;
    protected int edad;

    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract double calcularSueldo();

}
