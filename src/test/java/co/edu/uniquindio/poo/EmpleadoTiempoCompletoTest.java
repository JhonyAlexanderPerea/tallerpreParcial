/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTiempoCompletoTest
{

    @Test
    public void testCalcularSalarioTiempoCompleto()
    {
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Juan", "1"){};
        empleado.setSalario(50000);

        int salarioCalculado = empleado.calcularSalario();

        assertEquals(50000, salarioCalculado);
        assertEquals(100,salarioCalculado);
    }
}