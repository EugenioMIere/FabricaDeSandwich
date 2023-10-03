package ar.edu.unlam.pb2.sangucheto;

import static org.junit.Assert.*;

import org.junit.Test;

public class IngredientesTest {

	@Test
	public void queSePuedaDarElAltaDeUnIngrediente() {
		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 0;
		
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);
		
		String valorObtenido= ingredienteN1.getNombre();
		
		assertEquals(valorObtenido,nombreDeIngredeinte);
	}

}
