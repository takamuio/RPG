package Models;

public class CalcularExperiencia {
	public int level;
	Experiencia exp = new Experiencia();

	public CalcularExperiencia(int experiencia) throws Exception  {
		for (int i = 0; i < exp.estagios.size(); i++) {
			if ( experiencia < exp.estagios.get(i)) {
				level = i + 1;
				break;
			}
		}
	}
	
	private void validaValor(int valor) throws Exception {
		if(valor < 0) {
			throw new Exception("Valor da experiência não pode ser negativo !");
		} 
	}
}
