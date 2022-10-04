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

		System.out.printf("Informe nota 1: ");
		nota1 = N.nextDouble();
		System.out.printf("Informe nota 2: ");
		nota2 = N.nextDouble();
		System.out.printf("Informe nota 3: ");
		nota3 = N.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println(media);

		if (media >= 50) {
			if (media >= 60) {
				if (media >= 70) {System.out.println("Parabens nota maxima");}
			
	            else{System.out.println("Apravado60");}
			
			}
			else {System.out.println("Apravado50");}
		}
			
			
	 else if(media>=40) {System.out.println("Reprovado");}
	 
	 else{System.out.println("Saiu");}

	/* Operadores ternários são para micro validações */

	/*
	 * String resultado = media < 50 ? "Aluno reprovado": (media == 50 && nota1 ==
	 * 51) && (media > 40) ? "Aluno aprovado": "Chegar nessa mensagem";
	 * System.out.println(resultado);
	 */
	
	
}
}
