package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo = new FileInputStream (new File ("C:\\Users\\MarceloD\\git\\repository\\Novo\\src\\Arquivos\\arquivo.csv"));

		Scanner LerArq = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(LerArq.hasNext()) {
			
			String linha = LerArq.nextLine();
			//System.out.println(linha+" ---");
			
			if(linha != null && !linha.isEmpty()) {
			System.out.println(linha);
			
			
			
				String[] dados = linha.split(";");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
			
			}
			
		
		}
		
		System.out.println("----------------------");
		
		for(Pessoa p: pessoas) {
		
		System.out.println(p);
		
		}
	}
	
}
