package proj_executaveis;

import java.util.Arrays;
import java.util.List;

public class SplitArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Marcelo,Html,50, CSS, 48";
			
		System.out.println("Sub "+texto.substring(10, 20));
		
		String[] texto1 = texto.split(",");		
		
		System.out.println("Nome "+texto1[0]);
		System.out.println("Materia "+texto1[1]);
		System.out.println("Nota "+texto1[2]);
		System.out.println("Materia "+texto1[3]);
		System.out.println("Nota "+texto1[4]);
		
		System.out.println("Subs "+texto1.toString().substring(10));
		
		List<String> teste = Arrays.asList(texto1);
				
				for (String teste1 : teste) {
					
					System.out.println("Lista "+teste1);
					
				}
		String [] ArrayparaLista = teste.toArray(new String[texto1.length]);
		
		for(int p = 0; p < ArrayparaLista.length; p++) {
		
		System.out.println("teste imp "+ArrayparaLista[p]);
				
		}	
	}

}
