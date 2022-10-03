package attilio.v5.ver2;

import java.math.BigDecimal;

import com.example.geometria.Cerchio;
import com.example.geometria.Ellisse;
import com.example.geometria.Figura;
import com.example.geometria.FiguraGeometrica;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {

		BigDecimal preventivo;

		Preventivo p2 = new Preventivo();

		FiguraGeometrica r = new Rettangolo(20, 1);
		FiguraGeometrica r1 = new Rettangolo(40, 10);
		FiguraGeometrica q = new Quadrato(5);
		FiguraGeometrica q1 = new Quadrato(6);
		FiguraGeometrica c1 = new Cerchio(5);
		FiguraGeometrica c2 = new Cerchio(5);
		FiguraGeometrica f1 = new Figura(28, 35);

		p2.addPrato(r1);

		p2.listPrato();

		System.out.println("\n");

		p2.addSiepe(r);
		p2.addSiepe(r1);
		p2.addSiepe(q);
		p2.addSiepe(q1);
		p2.addSiepe(c1);
		p2.addSiepe(c2);

		p2.listSiepe();

		p2.removePrato(c1);
		p2.removePrato(c2);

		System.out.println("\n");

		System.out.printf("Preventivo Prato: %s \n", p2.preventivoPrato());
		System.out.printf("Preventivo Siepe: %s \n", p2.preventivoSiepe());
		System.out.printf("Preventivo Totale: %s \n", p2.calcoloPreventivo());

		System.out.println("--------------------- \n");

		p2.removePrato(f1);

		System.out.printf("Preventivo Prato: %s \n", p2.preventivoPrato());
		System.out.printf("Preventivo Siepe: %s \n", p2.preventivoSiepe());
		System.out.printf("Preventivo Totale: %s \n", p2.calcoloPreventivo());
		preventivo = p2.calcoloPreventivo();

	}

}
