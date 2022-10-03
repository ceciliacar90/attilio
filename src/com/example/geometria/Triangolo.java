package com.example.geometria;

import java.awt.geom.Point2D;
import java.util.Objects;

public class Triangolo extends FiguraGeometrica {

	private double latoA;
	private double latoB;
	private double latoC;

	public Triangolo(double latoA, double latoB, double latoC) {
		super();
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
	}
	
	public Triangolo(Point2D p1, Point2D p2, Point2D p3) {
		//questo this setta le variabili in automatico poichè passo 3 variabili double
		//per maggiori info vedi la classe Point2D
		this(p1.distance(p2),p1.distance(p3),p2.distance(p3));
	}

	@Override
	public double perimetro() {
		return latoA + latoB + latoC;
	}

	private double semiPerimetro() {
		return perimetro() / 2;
	}


	@Override
	public double area() {
		// formula di Erone
		// https://www.youmath.it/formulari/formulari-di-geometria-piana/406-tutte-le-formule-sul-triangolo-qualsiasi.html
		final double p = semiPerimetro();
		return Math.sqrt(p*(p-latoA)*(p-latoB)*(p-latoC));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangolo [latoA=");
		builder.append(latoA);
		builder.append(", latoB=");
		builder.append(latoB);
		builder.append(", latoC=");
		builder.append(latoC);
		builder.append(", perimetro()=");
		builder.append(perimetro());
		builder.append(", semiPerimetro()=");
		builder.append(semiPerimetro());
		builder.append(", area()=");
		builder.append(area());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(latoA, latoB, latoC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangolo other = (Triangolo) obj;
		return Double.doubleToLongBits(latoA) == Double.doubleToLongBits(other.latoA)
				&& Double.doubleToLongBits(latoB) == Double.doubleToLongBits(other.latoB)
				&& Double.doubleToLongBits(latoC) == Double.doubleToLongBits(other.latoC);
	}


}
