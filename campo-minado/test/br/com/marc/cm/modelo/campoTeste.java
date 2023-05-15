package br.com.marc.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.marc.cm.excecao.ExplosaoException;

public class campoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void inciarCampo() {
		campo = new Campo (3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		
		Campo vizinho = new Campo(3, 2);	
		boolean resultado = campo.addVizinho(vizinho);
		assertTrue(resultado);
		
		
		
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		
		Campo vizinho = new Campo(3, 4);	
		boolean resultado = campo.addVizinho(vizinho);
		assertTrue(resultado);
		
		
		
	}
	@Test
	void testeVizinhoDistancia1Emcima() {
		
		Campo vizinho = new Campo(2, 3);	
		boolean resultado = campo.addVizinho(vizinho);
		assertTrue(resultado);
		
		
		
	}
	
	@Test
	void testeVizinhoDistancia1Embaixo() {
		
		Campo vizinho = new Campo(4, 3);	
		boolean resultado = campo.addVizinho(vizinho);
		assertTrue(resultado);
		
		
		
	}
	
	@Test
	void testeNaoVizinhoDiagonal() {
		
		Campo vizinho = new Campo(2, 2);	
		boolean resultado = campo.addVizinho(vizinho);
		assertTrue(resultado);
		
	}
	
	@Test
	void testeNaoVizinhoDiagonalDistante() {
		
		Campo vizinho = new Campo(1, 1);	
		boolean resultado = campo.addVizinho(vizinho);
		assertFalse(resultado);
		
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		 assertFalse(campo.isMarcado());
		}
	@Test
	void testeAlternarMarcado() {
		campo.alternarMarcacao();
	 assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcadoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
	 assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinadoMarcado() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado2() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {campo.abrir();});
	}
	
	@Test
	void testeAbrirComVizinhos() {
		
		Campo campo11 = new Campo(1, 1);
		
		Campo campo22 = new Campo(2, 2);
		campo22.addVizinho(campo11);
		
		campo.addVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		Campo campo13 = new Campo(2, 3);
		Campo campo14 = new Campo(2, 4);
		Campo campo15 = new Campo(2, 5);
		
		
		campo15.alternarMarcacao();
	
		
		System.out.println("15 "+ campo15.toString());
		
		
		
		campo14.minar();
		campo11.minar();
		campo12.minar();
		campo13.minar();
		campo14.isAberto();
		campo14.alternarMarcacao();
		campo14.alternarMarcacao();
		campo13.alternarMarcacao();
		campo13.isAberto();
		campo12.minar();
		
		
		Campo campo22 = new Campo(2, 2);
		campo22.addVizinho(campo11);
		campo22.addVizinho(campo12);
		campo22.addVizinho(campo13);
		campo22.addVizinho(campo14);
		
		campo.addVizinho(campo22);
		campo.abrir();
		
		
		System.out.println(campo.minasNaVizinhanca());
		System.out.println(campo22.toString());
		assertTrue(campo22.isAberto() && campo15.isAberto());
		
	}
	
	
}
