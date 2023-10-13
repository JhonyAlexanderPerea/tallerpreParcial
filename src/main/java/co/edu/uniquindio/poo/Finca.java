package co.edu.uniquindio.poo;


import javax.swing.*;
import java.util.*;

public class Finca
{
    //Menu miMenu = new Menu();
    private Empleado empleado;
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    ArrayList<EmpleadoTiempoParcial> listaEmpleadosTiempoParcial = new ArrayList<>();
    ArrayList<EmpleadoRecoleccion> listaEmpleadosRecoleccion = new ArrayList<>();
    ArrayList<Empleado> listaEmpleadosMenorRendimiento = new ArrayList<>();
    ArrayList<Empleado> listaEmpleadosMayorSalario = new ArrayList<>();
    private EmpleadoTiempoParcial empleadoTiempoParcial;
    private EmpleadoRecoleccion empleadoRecoleccion;
    private String nombre;
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Empleado getEmpleado()
    {
        return empleado;
    }
    public void setEmpleado(Empleado empleado)
    {
        this.empleado = empleado;
    }
    public void adicionarEmpleado(Empleado empleado)
    {
        listaEmpleados.add(empleado);
    }
    public ArrayList<EmpleadoTiempoParcial> listarEmpleadosTiempoParcial ()
    {
        for (Empleado listaEmpleado : listaEmpleados)
        {
            if (listaEmpleado.getCargo().equals("2"))
            {
                listaEmpleadosTiempoParcial.add((EmpleadoTiempoParcial) listaEmpleado);
            }
        }
        return listaEmpleadosTiempoParcial;
    }
    public ArrayList<EmpleadoRecoleccion> listarEmpleadosRecoleccion ()
    {
        ArrayList<EmpleadoRecoleccion> listaEmpleadosRecoleccion = new ArrayList<>();

        for (Empleado listaEmpleado : listaEmpleados)
        {
            if (listaEmpleado.getCargo().equals("3"))
            {
                listaEmpleadosRecoleccion.add((EmpleadoRecoleccion) listaEmpleado);
            }
        }

        // Ordena la lista de empleados por número de kilos recolectados utilizando un comparador en línea.
        Collections.sort(listaEmpleadosRecoleccion, new Comparator<EmpleadoRecoleccion>()
        {
            @Override
            public int compare(EmpleadoRecoleccion emp1, EmpleadoRecoleccion emp2)
            {
                return emp1.getNumeroKilos() - emp2.getNumeroKilos();
            }
        });
        return  listaEmpleadosRecoleccion;
    }
    public void listarEmpleadosMenorRendimiento (ArrayList <Empleado> listaEmpleados)
    {
        String tipoEmpleado = "";
        for (Empleado listaEmpleado : listaEmpleados) {
            tipoEmpleado = listaEmpleado.getCargo();
        }
        switch (tipoEmpleado)
        {
            case "1":
                JOptionPane.showMessageDialog(null,"Usted es un empleado de tiempo completo, por ende no entra en la lista de menor rendimiento.");
                break;
            case "2":
                int promedioHoras = 0;
                int contadorHoras = 0;
                for (EmpleadoTiempoParcial tiempoParcial : listaEmpleadosTiempoParcial)
                {
                    contadorHoras += tiempoParcial.getNumeroHoras();
                }
                promedioHoras = contadorHoras/listaEmpleadosTiempoParcial.size();
                for (EmpleadoTiempoParcial tiempoParcial : listaEmpleadosTiempoParcial)
                {
                    if (tiempoParcial.getNumeroHoras() < promedioHoras)
                    {
                        listaEmpleadosMenorRendimiento.add(tiempoParcial);
                    }
                }
                break;
            case "3":
                int promedioKilos;
                int contadorKilos = 0;
                for (EmpleadoRecoleccion recoleccion : listaEmpleadosRecoleccion)
                {
                    contadorKilos += recoleccion.getNumeroKilos();
                }
                if (!listaEmpleadosRecoleccion.isEmpty())
                {
                    promedioKilos = contadorKilos/listaEmpleadosRecoleccion.size();
                }
                else
                {
                    promedioKilos = 0;
                }

                for (EmpleadoRecoleccion recoleccion : listaEmpleadosRecoleccion)
                {
                    if (recoleccion.getNumeroKilos() < promedioKilos)
                    {
                        listaEmpleadosMenorRendimiento.add(recoleccion);
                    }
                }
                break;
            default:
                break;
        }
        for (Empleado value : listaEmpleadosMenorRendimiento)
        {
            JOptionPane.showMessageDialog(null, "Nombre del empleado: " + value.getNombre() + "\n" +
                                                "Cargo: " + value.getCargo());
        }
    }
    public ArrayList<Empleado> listarEmpleadoSalarioMayorPromedio()
    {

        int promedio = 0;
        for (Empleado empleado : listaEmpleados)
        {
            if (empleado instanceof EmpleadoTiempoCompleto)
            {
                EmpleadoTiempoCompleto empleadoTiempoCompleto = (EmpleadoTiempoCompleto) empleado;
                promedio += empleadoTiempoCompleto.getSalario();
            }
            else if (empleado instanceof EmpleadoTiempoParcial)
            {
                EmpleadoTiempoParcial empleadoTiempoParcial = (EmpleadoTiempoParcial) empleado;
                promedio += empleadoTiempoParcial.calcularSalario();
            }
            else if (empleado instanceof EmpleadoRecoleccion)
            {
                EmpleadoRecoleccion empleadoRecoleccion = (EmpleadoRecoleccion) empleado;
                promedio += empleadoRecoleccion.calcularSalario();
            }
        }
        promedio /= listaEmpleados.size();


        ArrayList<Empleado> empleadosSalarioMayorPromedio = new ArrayList<>();
        for (Empleado empleado : listaEmpleados)
        {
            if (empleado instanceof EmpleadoTiempoCompleto)
            {
                EmpleadoTiempoCompleto empleadoTiempoCompleto = (EmpleadoTiempoCompleto) empleado;
                if (empleadoTiempoCompleto.getSalario() > promedio)
                {
                    empleadosSalarioMayorPromedio.add(empleado);
                }
            }
            else if (empleado instanceof EmpleadoTiempoParcial)
            {
                EmpleadoTiempoParcial empleadoTiempoParcial = (EmpleadoTiempoParcial) empleado;
                if (empleadoTiempoParcial.calcularSalario() > promedio)
                {
                    empleadosSalarioMayorPromedio.add(empleado);
                }
            }
            else if (empleado instanceof EmpleadoRecoleccion)
            {
                EmpleadoRecoleccion empleadoRecoleccion = (EmpleadoRecoleccion) empleado;
                if (empleadoRecoleccion.calcularSalario() > promedio)
                {
                    empleadosSalarioMayorPromedio.add(empleado);
                }
            }
        }


        Collections.sort(empleadosSalarioMayorPromedio, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado emp1, Empleado emp2) {
                return emp1.getNombre().compareTo(emp2.getNombre());
            }
        });

        return empleadosSalarioMayorPromedio;
    }
}
