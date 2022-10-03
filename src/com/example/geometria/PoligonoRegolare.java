package com.example.geometria;

/**
 *
 * @see https://www.youmath.it/formulari/formulari-di-geometria-piana/419-tutte-le-formule-sui-poligoni-regolari.html
 */
public class PoligonoRegolare extends FiguraGeometrica{
	private int numeroLati;
	private double lato;
	private double costanteArea;

	public double perimetro() {
		return lato * numeroLati;
	}

	public double area() {
		return lato * lato * costanteArea;
	}

	PoligonoRegolare (int numeroLati, double lato, double costanteArea){
		super();
		this.numeroLati = numeroLati;
		this.lato = lato;
		this.costanteArea = costanteArea;
	}

	//poligoni regolari ammessi: Pentagono, Esagono, Ottagono, Decagono
	public static Pentagono createPentagono(double lato) {
		Pentagono pentagono = new Pentagono(lato);
		return pentagono;
	}

	public static Esagono createEsagono(double lato) {
		Esagono esagono = new Esagono(lato);
		return esagono;
	}

	public static Ottagono createOttagono(double lato) {
		Ottagono ottagono = new Ottagono(lato);
		return ottagono;
	}

	public static Decagono createDecagono(double lato) {
		Decagono decagono = new Decagono(lato);
		return decagono;
	}

}