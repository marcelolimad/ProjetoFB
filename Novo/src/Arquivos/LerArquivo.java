package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo = new FileInputStream (new File ("D:\\Users\\marcelomls\\git\\repository\\Novo\\src\\Arquivos\\arquivo.txt"));

		Scanner LerArq = new Scanner(entradaArquivo, "UTF-8");
		
		while(LerArq.hasNext()) {
			
			String linha = LerArq.nextLine();
			//System.out.println(linha+" ---");
			
			if(linha != null && !linha.isEmpty()) {
			System.out.println(linha);
			}
		}
		
	}
	
}
