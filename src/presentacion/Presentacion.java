package presentacion;
import negocio.Parcial;

public class Presentacion {

    public static void main(String[] args) {

        Parcial calc = new Parcial();

        try {
            int res = calc.potencia(2, 10);
            System.out.println("Resultado: " + res);

        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}