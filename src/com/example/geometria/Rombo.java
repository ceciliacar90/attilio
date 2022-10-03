package com.example.geometria;

import com.example.geometria.util.TeoremaDiPitagora.TeoremaDiPitagora;

public class Rombo extends FiguraGeometrica{

	private double diagonaleMaggiore;
	private double diagonaleMinore;
	
	public Rombo(double diagonaleMaggiore, double diagonaleMinore) {
		super();
		this.diagonaleMaggiore = diagonaleMaggiore;
		this.diagonaleMinore = diagonaleMinore;
	}
	
	public double area() {
		return diagonaleMaggiore * diagonaleMinore /2;
	}
	
	public double perimetro() {
		return lato() * 4;
	}
	
	private double lato() {
		
		return TeoremaDiPitagora.CalcoloIpotenusa(diagonaleMinore / 2, diagonaleMaggiore / 2);
	
	}
}
