package com.example.attilio.v3.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.geometria.Cerchio;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;
import com.example.test.Log4j2Test;

import attilio.v3.Preventivo2;

class PreventivoTest {




	@Test
	void testAdd() {
		Preventivo2 p2 = new Preventivo2();

		p2.add(new Rettangolo(6,2));
		p2.add(new Rettangolo(6,2));
		p2.add(new Cerchio(3));
		p2.add(new Cerchio(5));
		p2.add(new Quadrato(1.5));
		p2.add(new Quadrato(1.5));
		p2.add(new Quadrato(2));
		p2.add(new Rettangolo (7,7));

	}

	@Test
	void testSize() {
		Preventivo2 p2 = new Preventivo2();

		p2.size();

	}
	
	@Test
	void testEspandiArray() {
		Preventivo2 p2 = new Preventivo2();
		
		
	}

}
