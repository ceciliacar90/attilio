package com.example.geometria;

import java.util.Objects;

import com.example.geometria.util.TeoremaDiPitagora.TeoremaDiPitagora;

public class Rettangolo extends FiguraGeometrica {

	private double base;
	private double altezza;

	/**
	 * Costruttura della classe rettangolo
	 * @param double base
	 * @param double altezza
	 */
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}


	/**
	 * Metodo del calcolo del perimetro
	 * @return (base + altezza)*2
	 */
	public double perimetro() {
		return (base + altezza)*2;
	}


	/**
	 * Metodo per calcolare l'area
	 * @return base * altezza
	 */
	public double area() {
		return (base * altezza);
	}

	public double diagonale() {
		return TeoremaDiPitagora.CalcoloIpotenusa(base, altezza);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [base=");
		builder.append(base);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append(", perimetro=");
		builder.append(perimetro());
		builder.append(", area=");
		builder.append(area());
		builder.append(", diagonale=");
		builder.append(diagonale());
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(altezza, base);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rettangolo other = (Rettangolo) obj;
		return Double.doubleToLongBits(altezza) == Double.doubleToLongBits(other.altezza)
				&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
	}

}
