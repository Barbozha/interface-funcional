package entities;

public class Compra {
	private String produto;
	private double valor;
	
	public Compra() {
		
	}

	public Compra(String produto, double valor) {
		this.produto = produto;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public double getValor() {
		return valor;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto: "+this.produto+ " Valor R$ "+this.valor;
	}
	
	
	
}
