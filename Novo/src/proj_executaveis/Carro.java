package proj_executaveis;

import principio.responsabilidade.DadosConta;


public class Carro {
	
	public static void main(String[] args) {
	
	
	String nome;
	int velocidade;
	String cor;
	String marca;
	boolean importado;
	double valor;
	
	DadosConta conta = new DadosConta();
	
	conta.depositoDinhero(75);
	conta.diminui50();
	conta.setDescricao(" Hope");
	
	System.out.println(conta);
	
	}
}
