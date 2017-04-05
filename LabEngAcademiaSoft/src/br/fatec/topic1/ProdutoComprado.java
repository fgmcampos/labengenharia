package br.fatec.topic1;

public class ProdutoComprado {
	
	private String id;
	private String idProduto;
	private String quantidade;
	private String custoUnitario;
	private String custoTotal;
	private String frete;
	private String impostos;
	private String estadoDestinoPedido;
	String precoFinal; 					// atributo package

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getCustoUnitario() {
		return custoUnitario;
	}

	public void setCustoUnitario(String custoUnitario) {
		this.custoUnitario = custoUnitario;
	}

	public String getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(String custoTotal) {
		this.custoTotal = custoTotal;
	}

	public String getFrete() {
		return frete;
	}

	public void setFrete(String frete) {
		this.frete = frete;
	}

	public String getImpostos() {
		return impostos;
	}

	public void setImpostos(String impostos) {
		this.impostos = impostos;
	}

	public String getEstadoDestinoPedido() {
		return estadoDestinoPedido;
	}

	public void setEstadoDestinoPedido(String estadoDestinoPedido) {
		this.estadoDestinoPedido = estadoDestinoPedido;
	}

	public String getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(String precoFinal) {
		this.precoFinal = precoFinal;
	}

}
