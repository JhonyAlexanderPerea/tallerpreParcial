package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoRecoleccionTest
{

    @Test
    public void testCalcularSalarioRecoleccion()
    {
        EmpleadoRecoleccion empleado = new EmpleadoRecoleccion("Carlos", "3") {};
        empleado.setNumeroKilos(1000);
        empleado.setValorKilos(5);

        int salarioCalculado = empleado.calcularSalario();

        assertEquals(5000, salarioCalculado);
        assertEquals("hola", salarioCalculado);
    }
}

