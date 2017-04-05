/**
 * 
 */
package br.fatec.view;

/**
 * @author x363482 decorator
 */

// Alguns impostos de uma loja virtual
// Cofins (Contribuição para o Financiamento da Seguridade Social)
// IPI (Imposto sobre Produtos Industrializados)
// PIS/Pasep (Programa de Integração Social)

public abstract class Imposto {

	protected Imposto nomeImposto;
	protected Imposto valorImposto;


	public Imposto getNomeImposto() {
		return nomeImposto;
	}


	public void setNomeImposto(Imposto nomeImposto) {
		this.nomeImposto = nomeImposto;
	}


	public Imposto getValorImposto() {
		return valorImposto;
	}


	public void setValorImposto(Imposto valorImposto) {
		this.valorImposto = valorImposto;
	}


	public abstract double calcula(Imposto valorImposto);

}
