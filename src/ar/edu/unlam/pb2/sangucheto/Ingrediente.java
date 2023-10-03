package ar.edu.unlam.pb2.sangucheto;

public class Ingrediente {

	private String nombre;
	private Double precio = 0.00;
	private Integer stock = 0;

	public Ingrediente(String nombre, Double precio, Integer stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public int getStock() {

		return this.stock;
	}

	public void setStock(Integer stock) {

		this.stock = stock;
	}

	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}

}
