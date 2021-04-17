package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Controllers.RolarDado;

class RolarDadoTeste {

	
	@Test
	void deveRetornarErroQuandoRolarUmDadoDeZeroFaces() {
		int faces = 0;
		
		Assert.assertThrows(Exception.class, ()->{
			int resultado = RolarDado.rolar(faces);
		});
	}
	
	
	@Test
	void deveRetornarErroQuandoRolarUmDadoDeFacesNegativa() {
		int faces = -1;
		
		Assert.assertThrows(Exception.class, ()->{
			int resultado = RolarDado.rolar(faces);
		});
	}

}
