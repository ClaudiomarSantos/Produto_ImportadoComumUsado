package entitadades;

import java.time.LocalDate;

public final class ProdutoUsado extends Produtos {
	private LocalDate dataFabricacao;

	public ProdutoUsado(String name, Double price, LocalDate dataFabricacao) {
		super(name, price);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String etiquetaPreco() {

		return "Nome: " + getName() + "(used) " + "Preço: " + getPrice() + "(data de Fabricação: " + dataFabricacao;

	}

}
