import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Arquivos.Pessoa;

public class Arqs_csv {

	public static void main(String[] args) throws IOException {
	
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
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		//String pasta = System.getProperty("user.home");
		
		//String arquivo = "D:\\Users\\marcelomls\\git\\repository\\Novo\\src\\Arquivos\\arquivo.txt";
		
		File arquivo = new File("C:\\Users\\MarceloD\\git\\repository\\Novo\\src\\Arquivos\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverArquivo = new FileWriter(arquivo);
		
		/*escreverArquivo.write("Meu arquivo");
		escreverArquivo.write("\n");
		escreverArquivo.write("Minha linha 2");
		escreverArquivo.write("\n");
		escreverArquivo.write("Minha linha 3");
		escreverArquivo.write("\n");
		for(int i=1; i<= 15; i++){
			escreverArquivo.write("adcionar numero "+ i + "\n");
			
		
		}*/
		
		for(Pessoa p: pessoas) {
			
			//escreverArquivo.write("Nomes" + ";" + p.getNome()+ ";" + " Email " + ";" + p.getEmail() + ";" + "Idade " + ";" +p.getIdade()+ "\n");
			escreverArquivo.write(p.getNome()+ ";" + p.getEmail() + ";"  +p.getIdade()+ "\n");
		}
		escreverArquivo.flush();
		escreverArquivo.close();
		
	}
		

	}


