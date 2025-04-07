package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private int anioInicio;
    private String rubro;
    private List<Empleado> empleados;

    public Empresa(String nombre, int anioInicio, String rubro) {
        this.nombre = nombre;
        this.anioInicio = anioInicio;
        this.rubro = rubro;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularSalarioTotal() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSueldo();
        }
        return total;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
