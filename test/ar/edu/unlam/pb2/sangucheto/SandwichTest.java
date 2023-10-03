package ar.edu.unlam.pb2.sangucheto;

import static org.junit.Assert.*;

import org.junit.Test;

public class SandwichTest {

	@Test
	public void queSePuedaDarAltaDeIngrediente() {

		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 4;

		Sandwich sandwich1 = new Sandwich();
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);

		Integer valorObtenido = sandwich1.altaIngrediente(ingredienteN1);

		Integer valoreEsperado = 1;

		assertEquals(valorObtenido, valoreEsperado);

	}

	@Test
	public void queSePuedaDarAltaDeCondimentos() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 0;

		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		Integer valorObtenido = sandwich1.altaCondimento(condimentoN1);

		Integer valoreEsperado = 1;

		assertEquals(valorObtenido, valoreEsperado);

	}

	@Test
	public void queSePuedaAgregarIngredientesAlSadwich() {

		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 100;
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);

		Sandwich sandwich1 = new Sandwich();
		sandwich1.altaIngrediente(ingredienteN1);

		Boolean valorEsperado = true;
		Boolean valorObtenido = sandwich1.setIngrediente(ingredienteN1);
		;

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaAgregarCondimentosAlSadwich() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 99;
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		Sandwich sandwich1 = new Sandwich();
		sandwich1.altaCondimento(condimentoN1);

		Boolean valorEsperado = true;
		Boolean valorObtenido = sandwich1.setCondimento(condimentoN1);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queDesceunteStockAlAgregarIngredientesAlSadwich() {

		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 100;
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);

		Sandwich sandwich1 = new Sandwich();
		sandwich1.altaIngrediente(ingredienteN1);

		sandwich1.setIngrediente(ingredienteN1);
		sandwich1.setIngrediente(ingredienteN1);

		Integer valorEsperado = 98;
		Integer valorObtenido = sandwich1.getStockDelIngredeinte(ingredienteN1);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queDesceunteStockAlAgregarCondimentosAlSadwich() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 99;

		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		sandwich1.altaCondimento(condimentoN1);
		sandwich1.setCondimento(condimentoN1);

		Integer valorEsperado = 98;
		Integer valorObtenido = sandwich1.getStockDelCondimento(condimentoN1);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaConsultarElPrecio() {
		// decalro valores
		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 99;
		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 100;

		// Incializo
		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);

		// cargo valores en arraylist
		sandwich1.altaCondimento(condimentoN1);
		sandwich1.altaIngrediente(ingredienteN1);

		sandwich1.setCondimento(condimentoN1);
		sandwich1.setIngrediente(ingredienteN1);

		Double valorEsperado = 52.00;
		Double valorObtenido = sandwich1.getPrecio();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaCacelarTodoElPedido() {
		// decalro valores
		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 99;
		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 100;

		// Incializo
		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);

		// cargo valores en arraylist
		sandwich1.altaCondimento(condimentoN1);
		sandwich1.altaIngrediente(ingredienteN1);

		sandwich1.setCondimento(condimentoN1);
		sandwich1.setIngrediente(ingredienteN1);

		sandwich1.cancelar();

		Double valorEsperado = 0.00;
		Double valorObtenido = sandwich1.getPrecio();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaListarLosIngredientes() {
		// decalro valores
		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 99;
		String nombreDeIngredeinte = "Jamon";
		Double precioDeIngrediente = 50.00;
		Integer stockDeIngredeinte = 100;

		// Incializo
		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);
		Ingrediente ingredienteN1 = new Ingrediente(nombreDeIngredeinte, precioDeIngrediente, stockDeIngredeinte);

		// cargo valores en arraylist
		sandwich1.altaCondimento(condimentoN1);
		sandwich1.altaIngrediente(ingredienteN1);

		sandwich1.setCondimento(condimentoN1);
		sandwich1.setIngrediente(ingredienteN1);

		String valorEsperado = ingredienteN1.getNombre() + ", " + condimentoN1.getNombre() + ", ";
		String valorObtenido = sandwich1.getDisponibles();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void quePuedaConsultarStock() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 0;

		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		sandwich1.altaCondimento(condimentoN1);

		Integer valorEsperado = 0;
		Integer valorObtenido = sandwich1.getStockDelCondimento(condimentoN1);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void darAltaIngredienteConStock0() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 20;

		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		sandwich1.altaCondimento(condimentoN1);
		sandwich1.setStockDelCondimento(condimentoN1, 3);

		Integer valorEsperado = 23;
		Integer valorObtenido = sandwich1.getStockDelCondimento(condimentoN1);

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaVenderUnIngrediente() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 100;

		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		sandwich1.altaCondimento(condimentoN1);

		sandwich1.comprarArticulo(condimentoN1, 40);

		Integer valorEsperado = 60;
		Integer valorObtenido = sandwich1.getStockDelCondimento(condimentoN1);

		assertEquals(valorEsperado, valorObtenido);

	}
	
	@Test
	public void queSePuedaEliminarUnIngrediente() {

		String nombreDeCondimento = "Mayonesa";
		Double precioDeCondimento = 2.00;
		Integer stockDeCondimento = 100;

		Sandwich sandwich1 = new Sandwich();
		Condimento condimentoN1 = new Condimento(nombreDeCondimento, precioDeCondimento, stockDeCondimento);

		sandwich1.altaCondimento(condimentoN1);

		

		Integer valorEsperado = 0;
		Integer valorObtenido = sandwich1.eliminarIngredientePorFaltaDeDisponibilidad(condimentoN1);

		assertEquals(valorEsperado, valorObtenido);

	}

}
