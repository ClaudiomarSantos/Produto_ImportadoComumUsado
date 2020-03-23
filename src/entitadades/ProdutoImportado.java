package entitadades;

public final class ProdutoImportado extends Produtos {
	private Double taxaAlfandega;

	public ProdutoImportado(String name, Double price, Double taxaAlfandega) {
		super(name, price);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	@Override
	public String etiquetaPreco() {
		return "Nome: " + getName() + " Preço: $"
				+ String.format("%.2f", (getPrice() + taxaAlfandega)) + "(taxa alfandegária: $" + taxaAlfandega + ")";

	}

	public Double totalPrice() {
		return getPrice() + taxaAlfandega;
	}
}
