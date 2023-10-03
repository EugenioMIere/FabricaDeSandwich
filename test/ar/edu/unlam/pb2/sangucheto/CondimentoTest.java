package ar.edu.unlam.pb2.sangucheto;

import static org.junit.Assert.*;

import org.junit.Test;

public class CondimentoTest {

	@Test
	public void queSePuedaDarElAltaDeUnCondimento() {
		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 0;
		
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);
		
		String valorObtenido= condimentoN1.getNombre();
		
		assertEquals(valorObtenido,nombreDeCondimento);
	}

}
