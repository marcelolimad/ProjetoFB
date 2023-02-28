package Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Arqs_excel {

	public static void main(String[] args) throws IOException {
		
		// Apache poi bibliotecas para criar arquivos xls
		
	    File arquivo = new File("C:\\Users\\MarceloD\\git\\repository\\Novo\\src\\Arquivos\\arquivo_excel.xls");
	    
	    if(!arquivo.exists()) {
	    	arquivo.createNewFile();
	    }
	    	Pessoa pessoa1 = new Pessoa();
	        pessoa1.setEmail("teste1@gmail.com");
	        pessoa1.setNome("teste1");
			pessoa1.setIdade(30);
	        
			Pessoa pessoa2 = new Pessoa();
	        pessoa2.setEmail("teste2@gmail.com");
	        pessoa2.setNome("teste2");
			pessoa2.setIdade(26);
			
			Pessoa pessoa3 = new Pessoa();
	        pessoa3.setEmail("teste3@gmail.com");
	        pessoa3.setNome("teste3");
			pessoa3.setIdade(29);
			
			Pessoa pessoa4 = new Pessoa();
	        pessoa4.setEmail("teste4@gmail.com");
	        pessoa4.setNome("teste4");
			pessoa4.setIdade(40);
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			pessoas.add(pessoa4);
			
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
			HSSFSheet linhaPessoa = hssfWorkbook.createSheet("Planilha_Java");
			
			int numeroLinha = 0;
			for(Pessoa p: pessoas) {
				
				Row linha = linhaPessoa.createRow(numeroLinha ++);
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula ++);
				celNome.setCellValue(p.getNome());
				//celNome.setCellValue("Nome");
				
				Cell celEmail = linha.createCell(celula ++);
				celEmail.setCellValue(p.getEmail());
				//celEmail.setCellValue("Email");
				
				Cell celIdade = linha.createCell(celula ++);
				celIdade.setCellValue(p.getIdade());
				//celEmail.setCellValue("Email");
				
				
			}
			
	    	FileOutputStream saida = new FileOutputStream(arquivo);
	    	hssfWorkbook.write(saida);
	    	saida.flush();
	    	saida.close();
	    	
	    	System.out.println("Planilha criada");
	    
	
	}

}
