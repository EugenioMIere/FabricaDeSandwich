package ar.edu.unlam.pb2.sangucheto;

public class Condimento extends Ingrediente {

	public Condimento(String nombre, Double precio, Integer stock) {
		super(nombre,precio,stock);
	}
	
	public String devuelveHola() {
		return "Hola";
	}

	public Double getPrecio() {
		
		return super.getPrecio();
	}
	

}
