package attilio.v4;

import java.math.BigDecimal;

import com.example.geometria.Cerchio;
import com.example.geometria.Ellisse;
import com.example.geometria.FiguraGeometrica;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {

		BigDecimal preventivo;

		Preventivo p2 = new Preventivo();

		p2.addPrato(new Rettangolo(20,1));
		p2.addPrato(new Quadrato(5));
		p2.addPrato(new Quadrato(6));
		p2.addPrato(new Cerchio(2));

		p2.listPrato();

		System.out.println("\n");

		p2.addSiepe(new Rettangolo(20,1));
		p2.addSiepe(new Quadrato(5));
		p2.addSiepe(new Quadrato(6));
		p2.addSiepe(new Cerchio(5));
		p2.addSiepe(new Cerchio(5));

		p2.listSiepe();

		//p2.remove(4);

		System.out.println("---------------------");

		preventivo = p2.calcoloPreventivo();
		System.out.printf("Preventivo %s", preventivo);
	}

}
