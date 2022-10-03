package com.example.geometria;

import java.util.Objects;

public class Trapezio extends FiguraGeometrica {


	private double baseMinore;
	private double baseMaggiore;
	private double altezza;

	public Trapezio(double baseMinore, double baseMaggiore, double altezza) {
		super();
		this.baseMinore = baseMinore;
		this.baseMaggiore = baseMaggiore;
		this.altezza = altezza;
	}

	@Override
	public double area() {
		return (baseMinore + baseMaggiore) * altezza / 2;
	}

	@Override
	public double perimetro() {
		return (baseMinore + baseMaggiore) * 2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trapezio [baseMinore=");
		builder.append(baseMinore);
		builder.append(", baseMaggiore=");
		builder.append(baseMaggiore);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append(", area()=");
		builder.append(area());
		builder.append(", perimetro()=");
		builder.append(perimetro());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(altezza, baseMaggiore, baseMinore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trapezio other = (Trapezio) obj;
		return Double.doubleToLongBits(altezza) == Double.doubleToLongBits(other.altezza)
				&& Double.doubleToLongBits(baseMaggiore) == Double.doubleToLongBits(other.baseMaggiore)
				&& Double.doubleToLongBits(baseMinore) == Double.doubleToLongBits(other.baseMinore);
	}

}