package Models;

public class Atributo {
	// 15, 14, 13, 12, 10, 8. base
	// 4d6 e soma os 3 maiores numeros

	private int quantia;

	public Atributo(int valor) throws Exception  {
		this.validaValor(valor);
		this.quantia = valor;
	}
	
	private void validaValor(int valor) throws Exception {
		if(valor < 0) {
			throw new Exception("Valor de atributo não pode ser negativo !");
		} 
	}

	public int getQuantia() {
		return quantia;
	}


	public int getModificador() {
		return (int) Math.floor((this.quantia - 10) / 2);
	}

}