package com.example.geometria;

public class Quadrato extends Rettangolo{

	private double lato;

	public Quadrato (double lato) {

		super(lato,lato);

		this.lato = lato;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrato [lato=");
		builder.append(lato);
		builder.append("]");
		return builder.toString();
	}



}
