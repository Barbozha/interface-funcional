package application;

import entities.Compra;
import impressao.Impressora;

public class TestandoImpressoras {

	public static void main(String[] args) {
		// Testando impressoras
		//Impressora i = new ImpressoraHP();
		Impressora i = (c) -> {
			System.out.println("Simulando a Impressão.Seria impresso "+c);
		};
		
		Compra compra = new Compra("Sabonete", 45.0);
		i.imprimir(compra);
	}

}
