package impressao;

import entities.Compra;

@FunctionalInterface
public interface Impressora {
	//É uma interface funcional porque só tem um método.
	public void imprimir(Compra c);

}
