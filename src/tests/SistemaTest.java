package tests;

import logica.*;
import modelo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SistemaTest {

    @Test
    public void testAgregar() {
        Sistema s = new Sistema();
        s.agregarJuego(new Juego("Ajedrez"));

        assertTrue(s.existeJuego("Ajedrez"));
    }
}