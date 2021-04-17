package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Models.Atributo;

class AtributoTeste {

	@Test
	void deveCalcularOModificadorDoAtributoDeValorDezCorretamente() throws Exception {
		int valor = 10;
		Atributo atributo = new Atributo(valor);

		int atual = atributo.getModificador();
		int esperado = 0;

		assertEquals(esperado, atual);
	}

	@Test
	void deveCalcularOModificadorDoAtributoDeValorVinteCorretamente() throws Exception {
		int valor = 20;
		Atributo atributo = new Atributo(valor);

		int atual = atributo.getModificador();
		int esperado = 5;

		assertEquals(esperado, atual);
	}

	@Test
	void deveCalcularOModificadorDoAtributoDeValorOnzeCorretamente() throws Exception {
		int valor = 11;
		Atributo atributo = new Atributo(valor);

		int atual = atributo.getModificador();
		int esperado = 0;

		assertEquals(esperado, atual);
	}

	@Test
	void deveCalcularOModificadorDoAtributoDeValorTresCorretamente() throws Exception {
		int valor = 3;
		Atributo atributo = new Atributo(valor);

		int atual = atributo.getModificador();
		int esperado = -3;

		assertEquals(esperado, atual);
	}

	@Test
	void deveLancarExceptionQuandoAtributoForNegativo() {
		int valor = -5;

		assertThrows(Exception.class, () -> {
			new Atributo(valor);
		});
	}

}
