package tests;
import negocio.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    Calculadora calc = new Calculadora();

    @Test
    public void testNormal() throws Exception {
        int res = calc.potencia(2, 10);
        assertEquals(1024, res);
    }

    @Test
    public void testLimite() throws Exception {
        int res = calc.potencia(2, 30);
        assertEquals(1073741824, res);
    }

    @Test
    public void testExponenteNegativo() {
        assertThrows(Exception.class, () -> calc.potencia(2, -1));
    }

    @Test
    public void testSuperaLimite() {
        assertThrows(Exception.class, () -> calc.potencia(2, 31));
    }
}