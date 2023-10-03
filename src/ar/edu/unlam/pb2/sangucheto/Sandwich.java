package ar.edu.unlam.pb2.sangucheto;

import java.util.ArrayList;

public class Sandwich {

	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	ArrayList<Ingrediente> ingredientesSandwich = new ArrayList<Ingrediente>();
	ArrayList<Condimento> condimentos = new ArrayList<Condimento>();
	ArrayList<Condimento> condimentosSandwich = new ArrayList<Condimento>();
	private Double costoTotal = 0.00;

	public Integer altaIngrediente(Ingrediente ingredienteN1) {

		this.ingredientes.add(ingredienteN1);
		return ingredientes.size();

	}

	public Integer altaCondimento(Condimento condimentoN1) {

		condimentos.add(condimentoN1);
		return condimentos.size();

	}

	public Boolean setIngrediente(Ingrediente ingredienteN1) {

		Boolean estadoDeAgregado = false;
		for (Ingrediente ingrediente : ingredientes) {
			if (ingrediente.equals(ingredienteN1)) {
				if (ingrediente.getStock() > 0) {
					ingrediente.setStock(ingredienteN1.getStock() - 1);
					this.ingredientesSandwich.add(ingredienteN1);
					estadoDeAgregado = true;
				}
			}
		}
		return estadoDeAgregado;

	}

	public Boolean setCondimento(Condimento condimentoN1) {
		Boolean estadoDeAgregado = false;
		for (Condimento condimento : condimentos) {
			if (condimento.equals(condimentoN1)) {
				if (condimento.getStock() > 0) {
					condimento.setStock(condimentoN1.getStock() - 1);
					this.condimentosSandwich.add(condimentoN1);
					estadoDeAgregado = true;
				}
			}
		}
		return estadoDeAgregado;

	}

	public Integer getStockDelIngredeinte(Ingrediente ingredienteN1) {
		Integer stockRestante = 0;
		for (Ingrediente ingrediente : ingredientes) {
			if (ingrediente.equals(ingredienteN1)) {
				stockRestante = ingrediente.getStock();
			}
		}
		return stockRestante;

	}

	public Integer getStockDelCondimento(Condimento condimentoN1) {
		Integer stockRestante = 0;
		for (Condimento condimento : condimentos) {
			if (condimento.equals(condimentoN1)) {
				stockRestante = condimento.getStock();
			}
		}
		return stockRestante;
	}

	public Double getPrecio() {
		// TODO Auto-generated method stub
		for (Condimento condimento : condimentosSandwich) {
			this.costoTotal += condimento.getPrecio();
		}
		for (Ingrediente ingrediente : ingredientesSandwich) {
			this.costoTotal += ingrediente.getPrecio();
		}
		return costoTotal;
	}

	public void cancelar() {
		// TODO Auto-generated method stub
		this.condimentosSandwich.clear();
		this.ingredientesSandwich.clear();

	}

	public String getDisponibles() {

		String listaDeingredeintes = "";
		for (Ingrediente ingrediente : ingredientes) {
			listaDeingredeintes += ingrediente.getNombre() + ", ";
		}
		for (Condimento condimento : condimentos) {
			listaDeingredeintes += condimento.getNombre() + ", ";
		}
		return listaDeingredeintes;

	}

	public void setStockDelCondimento(Condimento condimentoN1, Integer aSumar) {

		for (Condimento condimento : condimentos) {
			if (condimento.equals(condimentoN1)) {
				condimento.setStock(condimento.getStock() + aSumar);
			}
		}

	}

	public void comprarArticulo(Condimento condimentoN1, Integer aDescontar) {
		// TODO Auto-generated method stub
		for (Condimento condimento : condimentos) {
			if (condimento.equals(condimentoN1)) {

				condimento.setStock(condimentoN1.getStock() - aDescontar);

			}
		}

	}

	public Integer eliminarIngredientePorFaltaDeDisponibilidad(Condimento condimentoN1) {
		condimentos.remove(condimentoN1);
		return condimentos.size();
	}

}

//for (Ingrediente ingrediente : ingredientes) {
//	if (ingrediente.getNombre().equals(ingredienteN1.getNombre())) {
//		if (ingrediente.getStock() > 0) {
//			ingredientes.add(ingredienteN1);
//			ingrediente.setStock(ingrediente.getStock() - 1);
//
//			stockRestante = ingrediente.getStock();
//		}
//	}
//}
