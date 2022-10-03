package com.example.geometria;

public class Cerchio extends Ellisse {

	//private double raggio;

	// costruttore
	public Cerchio(double raggio) {
		super(raggio, raggio);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [area=");
		builder.append(area());
		builder.append(", perimetro=");
		builder.append(perimetro());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


}
