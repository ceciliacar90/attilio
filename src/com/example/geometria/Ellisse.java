package com.example.geometria;

import java.util.Objects;

public class Ellisse extends FiguraGeometrica {

	private double semiasseA;
	private double semiasseB;

	public Ellisse(double semiasseA, double semiasseB) {
		this.semiasseA = semiasseA;
		this.semiasseB = semiasseB;
	}

	public double area() {
		return 3.14 * semiasseA * semiasseB;
	}

	public double perimetro() {
		return 2 * Math.PI * Math.sqrt((Math.pow(semiasseA, 2) + Math.pow(semiasseB, 2)) / 2)
;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [semiasseA=");
		builder.append(semiasseA);
		builder.append(", semiasseB=");
		builder.append(semiasseB);
		builder.append(", area=");
		builder.append(area());
		builder.append(", perimetro=");
		builder.append(perimetro());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(semiasseA, semiasseB);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ellisse other = (Ellisse) obj;
		return Double.doubleToLongBits(semiasseA) == Double.doubleToLongBits(other.semiasseA)
				&& Double.doubleToLongBits(semiasseB) == Double.doubleToLongBits(other.semiasseB);
	}
}

