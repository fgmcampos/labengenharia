package br.fatec.controller;


import br.fatec.view.Imposto;

public class ImpostoController extends Imposto {

	
	public void Imposto() {
		this.nomeImposto = null;
	}

	public void Imposto(Imposto nomeImposto) {
		this.nomeImposto = nomeImposto;
	}

	public double calculoImposto(Imposto valorImposto) {
		if (super.valorImposto == null) {
			return 0;
		}

		return super.valorImposto.calcula(valorImposto);
	}
	
	@Override
	public double calcula(Imposto valorImposto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
