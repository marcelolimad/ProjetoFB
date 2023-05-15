package br.com.marc.cm;

import br.com.marc.cm.modelo.Tabuleiro;
import br.com.marc.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,3);
		new TabuleiroConsole(tabuleiro);
		
		
		
		//tabuleiro.alterarMarcacao(4, 2);
		//tabuleiro.alterarMarcacao(4, 5);
		//tabuleiro.abrir(3, 3);
		
	
		

	
		
	}

}
