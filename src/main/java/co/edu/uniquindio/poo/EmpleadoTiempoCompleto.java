package co.edu.uniquindio.poo;

public abstract class EmpleadoTiempoCompleto extends Empleado
{
    private int salario;

    public EmpleadoTiempoCompleto(String nombre, String cargo) {
        super(nombre, cargo);
    }

    public int getSalario()
    {
        return salario;
    }

    public void setSalario(int salario)
    {
        this.salario = salario;
    }

    @Override
    public int calcularSalario()
    {
        return salario;
    }
}
