package br.fatec.controller;

import br.fatec.view.Imposto;;

public class ISS extends ImpostoController {
	 
    public ISS() {
        super();
    }
    
    public ISS(Imposto outroImposto) {
        super();
    }
 
    public double calcula(Imposto valorImposto) {
        return valorImposto.calcula(valorImposto) * 0.06;
    }
 
}
