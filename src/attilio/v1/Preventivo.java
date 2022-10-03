package attilio.v1;

import com.example.geometria.FiguraGeometrica;

public class Preventivo {

	private double area;
	private double perimetro;

	public void gestisciZona(FiguraGeometrica zona) {

		area = area + zona.area();
		perimetro = perimetro + zona.perimetro();
	}

	public double preventivoSiepe () {
		return perimetro * 18;
	}

	public double preventivoPrato() {
		return area * 6;
	}

	public double sommaPreventivo (FiguraGeometrica[] fg) {

		double sommaSiepe = 0;
		double sommaPrato = 0;

		Preventivo p = new Preventivo();

		for (int i = 0; i < fg.length; i++) {

			p.gestisciZona(fg[i]);

		}

		sommaSiepe = p.preventivoSiepe();
		sommaPrato = p.preventivoPrato();

		return sommaSiepe + sommaPrato;

	}
}
