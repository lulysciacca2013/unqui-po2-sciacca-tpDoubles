package ar.edu.unq.po2.poker;

public class Carta {
	private Valor valor;
	private Color color;
	
	public Carta(Valor valor, Color color) {
		super();
		this.valor = valor;
		this.color = color;
	}
	
	public Valor getValor() {
		return valor;
	}

	public Color getColor() {
		return color;
	}

	public boolean esMayorA(Carta carta) {
		return this.getValor().esMayorA(carta.getValor());
	}
	
	public boolean esMismoColor(Carta carta) {
		return this.getColor().equals(carta.getColor());
	}
	
}