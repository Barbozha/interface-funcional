package impressao.impressora;

import entities.Compra;
import impressao.Impressora;

public class ImpressoraHP implements Impressora{

	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando o comando para impressora HP -> "+c);
		
		
	}
	
}
