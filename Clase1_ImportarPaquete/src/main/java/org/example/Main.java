package org.example;

import org.example.*;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Tech Solutions", 2005, "Software");
        Administrativo admin = new Administrativo("Carlos", "Pérez", 40, empresa);

        Empleado emp1 = new EmpleadoHora("Juan", "Gómez", 25, 10.5, 160);
        Empleado emp2 = new EmpleadoFijo("Ana", "López", 30, 3000);

        admin.darDeAltaEmpleado(emp1);
        admin.darDeAltaEmpleado(emp2);

        System.out.println("Salario total a pagar por la empresa: " + admin.calcularSalarioTotalEmpresa());

    }
}