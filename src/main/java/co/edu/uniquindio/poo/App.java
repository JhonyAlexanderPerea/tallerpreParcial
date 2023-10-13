package co.edu.uniquindio.poo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class
App
{
    public static void main(String[] args)
    {
        Finca miFinca = new Finca();

        EmpleadoTiempoCompleto empleadoTiempoCompleto1 = new EmpleadoTiempoCompleto("Juan", "1"){};
        empleadoTiempoCompleto1.setSalario(50000);

        EmpleadoTiempoParcial empleadoTiempoParcial1 = new EmpleadoTiempoParcial("Ana", "2"){};
        empleadoTiempoParcial1.setNumeroHoras(10);
        empleadoTiempoParcial1.setSalarioHora(15);

        EmpleadoRecoleccion empleadoRecoleccion1 = new EmpleadoRecoleccion("Carlos", "3"){};
        empleadoRecoleccion1.setValorKilos(10);
        empleadoRecoleccion1.setNumeroKilos(800);

        miFinca.adicionarEmpleado(empleadoTiempoCompleto1);
        miFinca.adicionarEmpleado(empleadoTiempoParcial1);
        miFinca.adicionarEmpleado(empleadoRecoleccion1);


        ArrayList <Empleado> listaEmpleados = miFinca.listaEmpleados;

        ArrayList<EmpleadoTiempoParcial> empleadosTiempoParcial = miFinca.listarEmpleadosTiempoParcial();
        System.out.println("Empleados de tiempo parcial: ");
        for (EmpleadoTiempoParcial empleado : empleadosTiempoParcial)
        {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }

        ArrayList<EmpleadoRecoleccion> empleadosRecoleccion = miFinca.listarEmpleadosRecoleccion();
        System.out.println("Empleados de recolección: ");
        for (EmpleadoRecoleccion empleado : empleadosRecoleccion)
        {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }

        ArrayList<Empleado> empleadosSalarioMayorPromedio = miFinca.listarEmpleadoSalarioMayorPromedio();
        System.out.println("Empleados con salario mayor al promedio:");
        for (Empleado empleado : empleadosSalarioMayorPromedio)
        {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }

        ArrayList<Empleado> empleadosBajoRendimiento = miFinca.listaEmpleadosMenorRendimiento;
        System.out.println("Empleados con bajo rendimiento:");
        for (Empleado empleado : empleadosBajoRendimiento)
        {
            System.out.println("Nombre: " + empleado.getNombre() + ", Cargo: " + empleado.getCargo());
        }
    }
}
