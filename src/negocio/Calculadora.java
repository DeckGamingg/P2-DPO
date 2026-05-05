package negocio;

public class Calculadora {

    public int potencia(int b, int e) throws Exception {

        if(e < 0) throw new Exception("Exponente no puede ser negativo");

        long res = (long) Math.pow(b, e);

        if(res > 2147483647) throw new Exception("Resultado supera el limite entero");

        return (int) res;
    }
}