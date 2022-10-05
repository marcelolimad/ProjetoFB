package teste;

import java.util.*;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner N = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double media;
		double resto;

		System.out.printf("Informe nota 1: ");
		nota1 = N.nextDouble();
		System.out.printf("Informe nota 2: ");
		nota2 = N.nextDouble();
		System.out.printf("Informe nota 3: ");
		nota3 = N.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;
		
		resto = nota1 % nota2;

		System.out.println(media);
		System.out.println(resto);

		if (media >= 50) {
			if (media >= 60) {
				if (media >= 70) {System.out.println("Parabens nota maxima");}
			
	            else{System.out.println("Apravado60");}
			
			}
			else {System.out.println("Apravado50");}
		}
			
			
	 else if(media>=40) {System.out.println("Reprovado");}
	 
	 else{System.out.println("Saiu");}
		
	    /*String md =  Double.toString(media);*/
		
		int i = (int)media;
		
		switch (i) {
		case 50: System.out.println("aprovado-SW");
			
			break; 

		default: System.out.println("Valeu-SW");
			break;
		}
		
		int numero = 0;
		
		while (numero <= 5) { /* Verificar e depois executa */
		
			System.out.println("o numero é " + numero);
			numero ++;
		}
		
		int numero2 = 0;
		
		do { /* primeiro executa e depois verificar */
		
			System.out.println("O numero2 atual é: " + numero2);
			numero2 ++;
			
		}while (numero2<= 10);
		
		/* estrutura de repitição com break para o codigo */
		
		for (int num = 0; num <=10; num ++  ) {
			
			if (num == 5) {
			
			System.out.println("Encontrei o numero 5");
			
			break; 
			}
		}
			
			/* estrutura de repitição com "continue" para continuar o codigo */
			
			for (int nume = 0; nume <=10; nume ++  ) {
				
				if (nume == 2 || nume == 1 || nume == 9) {
				
				System.out.println("Encontrei o nume " + nume);
				 
				continue;
				}
				
				System.out.println("processando");
			}
			
			
			
		}
		
		
		

	/* Operadores ternários são para micro validações */

	/*
	 * String resultado = media < 50 ? "Aluno reprovado": (media == 50 && nota1 ==
	 * 51) && (media > 40) ? "Aluno aprovado": "Chegar nessa mensagem";
	 * System.out.println(resultado);
	 */
	
	
}

