package Ejercicios31;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class TicketTest {
	
	@Before
	public void before(){
		Ticket t1 = new Ticket();
		System.out.println("Hola");
		LineaTicket tl1 = new LineaTicket("Leche", 5, 500);
		LineaTicket tl2 = new LineaTicket("Carne", 3, 100);
		
	}
	
	@Test
	public void test() {
		Ticket t1 = new Ticket();
		t1.agregarLineaTicket(tl2);
		t1.agregarLineaTicket(tl1);
		assertEquals(8, t1.getUnidadesVendidas());
	}

}
