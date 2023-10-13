package co.edu.uniquindio.poo;

public abstract class EmpleadoRecoleccion extends Empleado
{
    private int numeroKilos,valorKilos;

    public EmpleadoRecoleccion(String nombre, String cargo) {
        super(nombre, cargo);
    }

    public int getValorKilos() {
        return valorKilos;
    }

    public void setValorKilos(int valorKilos) {
        this.valorKilos = valorKilos;
    }

    public int getNumeroKilos() {
        return numeroKilos;
    }

    public void setNumeroKilos(int numeroKilos) {
        this.numeroKilos = numeroKilos;
    }

    @Override
    public int calcularSalario()
    {
        return numeroKilos*valorKilos;
    }


}
