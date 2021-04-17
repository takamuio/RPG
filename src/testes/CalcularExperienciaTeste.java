package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Models.Atributo;
import Models.CalcularExperiencia;

class CalcularExperienciaTeste {
	
	
	@Test
	void deveMostrarNivelDezDoPersonagemPelaExperienciaTotal() throws Exception {
		int experiencia = 64700;
		CalcularExperiencia calcular = new CalcularExperiencia(experiencia);		
		
		int lvl = 10;

		assertEquals(calcular.level, lvl);
	}
	

	@Test
	void deveMostrarNivelDoisDoPersonagemPelaExperienciaTotal() throws Exception {
		int experiencia = 310;
		CalcularExperiencia calcular = new CalcularExperiencia(experiencia);		
		
		int lvl = 2;

		assertEquals(calcular.level, lvl);
	}
	
	@Test
	void deveMostrarNivelUmDoPersonagemPelaExperienciaTotal() throws Exception {
		int experiencia = 0;
		CalcularExperiencia calcular = new CalcularExperiencia(experiencia);		
		
		int lvl = 1;

		assertEquals(calcular.level, lvl);
	}
	
	@Test
	void deveLancarExcepionQuandoExperienciaForNegativa() throws Exception {
		int experiencia = -400;				
		
		assertThrows(Exception.class, () -> {
			new Atributo(experiencia);
		});	
	}
	

}
