package co.edu.uniquindio.poo;

import javax.swing.*;

public abstract class Empleado
{
    private String nombre;
    private String cargo;


    public Empleado(String nombre, String cargo)
    {
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre( String nombre )
    {
        this.nombre = nombre;
    }
    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }
    public abstract int calcularSalario();

}
