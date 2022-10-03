package com.example.geometria;

public class Figura extends FiguraGeometrica {

	
	private double area;
	private double perimetro;
	
	public Figura(double perimetro, double area){
		this.area = area;
		this.perimetro = perimetro;
	}
	
	public double area() {
		return area;
	}

	@Override
	public double perimetro() {
		return perimetro;
	}

}
