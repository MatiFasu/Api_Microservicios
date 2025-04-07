package org.example;

public class Administrativo extends Empleado{

    private Empresa empresa;

    public Administrativo(String nombre, String apellido, int edad, Empresa empresa) {
        super(nombre, apellido, edad);
        this.empresa = empresa;
    }

    public void darDeAltaEmpleado(Empleado empleado) {
        empresa.agregarEmpleado(empleado);
    }

    public double calcularSalarioTotalEmpresa() {
        return empresa.calcularSalarioTotal();
    }

    @Override
    public double calcularSueldo() {
        return 0; // No se especifica sueldo para este rol
    }

}
