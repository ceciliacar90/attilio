package attilio.v3;

import com.example.geometria.Cerchio;
import com.example.geometria.Ellisse;
import com.example.geometria.FiguraGeometrica;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {


		Preventivo2 p2 = new Preventivo2();
		p2.add(new Rettangolo(6,2));
		p2.add(new Rettangolo(6,2));
		p2.add(new Cerchio(3));
		p2.add(new Cerchio(5));
		p2.add(new Quadrato(1.5));
		p2.add(new Quadrato(1.5));
		p2.add(new Quadrato(2));
		p2.add(new Rettangolo (7,7));

		p2.list();

		p2.remove(4);

		System.out.println("---------------------");

		p2.stampa();
		p2.list();
	}

}
