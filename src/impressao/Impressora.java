package impressao;

import entities.Compra;

@FunctionalInterface
public interface Impressora {
	//� uma interface funcional porque s� tem um m�todo.
	public void imprimir(Compra c);

}
