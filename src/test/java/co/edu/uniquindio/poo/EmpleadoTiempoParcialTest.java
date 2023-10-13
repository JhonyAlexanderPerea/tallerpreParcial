package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTiempoParcialTest {

    @Test
    public void testCalcularSalarioTiempoParcial() {
        EmpleadoTiempoParcial empleado = new EmpleadoTiempoParcial("Ana", "2"){};
        empleado.setNumeroHoras(20);
        empleado.setSalarioHora(15);

        int salarioCalculado = empleado.calcularSalario();

        assertEquals(300, salarioCalculado);
    }
}
