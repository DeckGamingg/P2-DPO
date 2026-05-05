package logica;

import modelo.*;
import java.util.*;

public class Sistema {

    private List<Juego> juegos = new ArrayList<>();

    public void agregarJuego(Juego j) {
        juegos.add(j);
    }

    public Juego buscarJuegoPorNombre(String nombre) {
        for (Juego j : juegos) {
            if (j.getNombre().equals(nombre)) {
                return j;
            }
        }
        return null;
    }

    public boolean existeJuego(String nombre) {
        return buscarJuegoPorNombre(nombre) != null;
    }
}