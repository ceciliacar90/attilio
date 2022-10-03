package attilio.v4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.geometria.FiguraGeometrica;
import com.example.test.Log4j2Test;

public class Preventivo {

	private double prezzoSiepe = 18.0;
	private double prezzoPrato = 6.0;
	private List <FiguraGeometrica> prato = new ArrayList<>();
	private List <FiguraGeometrica> siepe = new ArrayList<>();
	private double preventivoSiepe;
	private double preventivoPrato;
	private FiguraGeometrica fg = null;

	private static final Logger log = LogManager.getLogger(Log4j2Test.class);



	public void addSiepe(FiguraGeometrica fg) {
		siepe.add(fg);
	}

	public void addPrato(FiguraGeometrica fg) {
		prato.add(fg);
	}

	public int sizePrato() {
		return prato.size();
	}

	public int sizeSiepe() {
		return siepe.size();
	}

	//iterare sulla lista
	public void listPrato() {

		/* sistama con l'iterato
		 * int i = 1;
		 *
		 * Iterator<FiguraGeometrica> it = figura.iterator();
		 *
		 * log.info(it.getClass().getName());
		 *
		 * while(it.hasNext()) {
		 *
		 * System.out.printf("%d) %s", i, it.next()); System.out.println("\n"); i++; }
		 */

		//sistema con il for each che fa la stessa cosa

		int i = 1;
		//tipo nome : cosa --> tipo e cosa devono essere dello stesso tipo
		for (FiguraGeometrica figura: prato) {
			if(figura == null)
				continue;
			System.out.printf("%d) %s", i , figura);
			System.out.println("\n");
			i++;
		}
	}

	public void listSiepe() {

		int i = 1;
		//tipo nome : cosa --> tipo e cosa devono essere dello stesso tipo
		for (FiguraGeometrica figura: siepe) {
			if(figura == null)
				continue;
			System.out.printf("%d) %s", i , figura);
			System.out.println("\n");
			i++;
		}
	}

	public double removePrato (FiguraGeometrica fg) {
		
		this.fg = fg;
		if(fg == null)
			return this.preventivoPrato;
		else
		return this.preventivoPrato = preventivoPrato - fg.area()*prezzoPrato;
	}

	public double removeSiepe (FiguraGeometrica fg) {
		
		this.fg = fg;
		if(fg == null)
			return this.preventivoSiepe;
		else
		return this.preventivoSiepe = preventivoSiepe - fg.perimetro()*prezzoSiepe;
	}


	private double calcoloSiepe() {

		double preventivoSiepe = 0;

		for (int i = 0; i < siepe.size(); i++) {
			preventivoSiepe = preventivoSiepe + siepe.get(i).perimetro();
		}

		log.info("preventivo Siepe: " + preventivoSiepe*prezzoSiepe);
		this.preventivoSiepe = preventivoSiepe*prezzoSiepe;
		return preventivoSiepe;
	}

	private double calcoloPrato() {

		double preventivoPrato = 0;

		for (int i = 0; i < prato.size(); i++) {
			preventivoPrato = preventivoPrato + prato.get(i).area();
		}

		log.info("preventivo Prato: " + preventivoPrato*prezzoPrato);
		this.preventivoPrato = preventivoPrato*prezzoPrato;
		return preventivoPrato;
	}


	public BigDecimal calcoloPreventivo() {

		double preventivo;
		preventivo = calcoloSiepe() + calcoloPrato() - removePrato(fg) - removeSiepe(fg) ;
		return new BigDecimal(preventivo);
	}

}
