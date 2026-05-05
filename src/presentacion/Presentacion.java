package presentacion;
import negocio.Calculadora;

public class Presentacion {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        try {
            int res = calc.potencia(2, 10);
            System.out.println("Resultado: " + res);

        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}