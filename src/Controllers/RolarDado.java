package Controllers;

import java.util.Random;

public class RolarDado {
	private static Random aleatorio = new Random();

	public static int rolar(int lados) {
		return aleatorio.nextInt(lados);
	}

	public static int rolar(int quantidadeDado, int ladosDado) {

		int retorno = 0;

		for (int i = 0; i < quantidadeDado; i++) {
			retorno += RolarDado.rolar(ladosDado);
		}

		return retorno;
	}

}
