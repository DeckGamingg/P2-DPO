package negocio;

public abstract class Calculadora {
	protected int base;
	protected int exponente;
	
	public Calculadora(int d, int e) {
		this.base = d;
		this.exponente = e;	
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int d) {
		this.base = d;
	}

	public int getExponente() {
		return exponente;
	}

	public void setExponente(int e) {
		this.exponente = e;
	}
	
	public abstract int base();
	public abstract int exponente();
	

	
}

