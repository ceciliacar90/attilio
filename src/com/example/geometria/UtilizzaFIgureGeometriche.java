package com.example.geometria;

public class UtilizzaFIgureGeometriche {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(10, 5.5);
		Rettangolo r2 = new Rettangolo(22.5, 15.1);
		Quadrato q1 = new Quadrato(23.4);
		Cerchio c1 = new Cerchio(2.1);


		System.out.println("Area del rettangolo r1 = " + r1.area());
		System.out.println("Perimetro del rettangolo r1 =" + r1.perimetro());
		System.out.println("perimetro del quadrato q1 = " + q1.perimetro());
		System.out.println("circonferenza cerchio c1 = " + c1.perimetro());

		if(r1 == r2)
			System.out.println("r1 è uguale ad r2");
			else
				System.out.println("r1 è diverso da r2");

	}
}
