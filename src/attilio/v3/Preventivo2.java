package attilio.v3;

import java.math.BigDecimal;
import java.util.logging.Logger;

import com.example.geometria.FiguraGeometrica;

public class Preventivo2 {

	private double prezzoSiepe = 18.0;
	private double prezzoPrato = 6.0;
	private FiguraGeometrica[] figure = new FiguraGeometrica[6];
	private int indice;

	public void add(FiguraGeometrica figura) {

		if (indice >= figure.length)
			espandiArray(indice);
		figure[indice] = figura;
		indice++;

	}

	public int size() {
		return indice;
	}

	private void espandiArray(int lenght) {
		FiguraGeometrica figure [] = new FiguraGeometrica [this.figure.length + lenght];

		// array copy di java
		System.arraycopy(this.figure, // Object src,
				0, // int srcPos,
				figure, // Object dest,
				0, // int destPos,
				this.figure.length); // int length);

		this.figure = figure;
	}

	public void list() {
		// stampa il contenuto dell'array

		for (int i = 0; i < indice; i++) {

			System.out.printf("%d) ", i + 1);

			System.out.printf("%s", figure[i]);

			System.out.println("\n");

		}

	}

	// fare dopo
	public void remove(int posizione) {

		figure[posizione-1] = null;

		System.arraycopy(this.figure, // Object src,
				posizione, // int srcPos,
				figure, // Object dest,
				posizione-1, // int destPos,
				indice); // int length);

		this.indice --;
		/*
		 * figure[posizione-1] = figure[indice-1];
			figure [indice] = null;
		 *
		 * this.indice --;
		 */
	}

	private double calcoloSiepe() {

		double preventivoSiepe = 0;

		for (int i = 0; i < figure.length; i++) {
			preventivoSiepe = preventivoSiepe + figure[i].perimetro();
		}

		return preventivoSiepe*prezzoSiepe;
	}

	private double calcoloPrato() {

		double preventivoPrato = 0;

		for (int i = 0; i < figure.length; i++) {
			preventivoPrato = preventivoPrato + figure[i].area();
		}

		return preventivoPrato*prezzoPrato;
	}



	public BigDecimal calcoloPreventivo() {

		double preventivo;
		preventivo = calcoloPrato() + calcoloSiepe();
		return new BigDecimal(preventivo);
	}

	public void stampa() {


		System.out.println(String.format("Preventivo totale: %s", calcoloPreventivo()));

	}
}
