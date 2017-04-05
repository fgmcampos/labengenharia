package br.fatec.controller;

import br.fatec.view.Imposto;

public class ICMS extends ImpostoController {
	 
    public ICMS() {
        super();
    }
    
    public ICMS(Imposto outroImposto) {
        super();
    }
 
    public double calcula(ImpostoController valorImposto) {
        return valorImposto.calculoImposto(valorImposto) * 0.1 ;
    }

	@Override
	public double calcula(Imposto valorImposto) {
		// TODO Auto-generated method stub
		return 0;
	}
 
}