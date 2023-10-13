package co.edu.uniquindio.poo;

public class EmpleadoTiempoParcial extends Empleado
{

    private int numeroHoras,salarioHora;

    public EmpleadoTiempoParcial(String nombre, String cargo)
    {
        super(nombre, cargo);
    }

    public int getNumeroHoras()
    {
        return numeroHoras;
    }
    public void setNumeroHoras(int numeroHoras)
    {
        this.numeroHoras = numeroHoras;
    }
    public int getSalarioHora()
    {
        return salarioHora;
    }
    public void setSalarioHora(int salarioHora)
    {
        this.salarioHora = salarioHora;
    }

    @Override
    public int calcularSalario()
    {
        return numeroHoras*salarioHora;
    }
}
