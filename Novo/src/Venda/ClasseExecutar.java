package Venda;

import java.math.BigDecimal;

public class ClasseExecutar {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(100L);
		produto1.setNome("Copo");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(200L);
		produto2.setNome("Garrafa");
		produto2.setValor(BigDecimal.valueOf(200));
		
		Produto produto3 = new Produto();
		produto3.setId(300L);
		produto3.setNome("Garrafa2");
		produto3.setValor(BigDecimal.valueOf(300));
		
		
		Venda venda = new Venda();
		
		venda.setDescricaoVenda("Venda de Livros");
		venda.setEnderecoEntrega("enviar por email");
		venda.setId(50L);
		venda.setNomeCliente("Bernardo");
		venda.setValorTotal(BigDecimal.valueOf(156.000));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		
		venda.addProduto(produto3);
		
		System.out.println("Descrição da Venda : " + venda.getDescricaoVenda() + " E o total = " + venda.getValorTotal());
		
		for(Produto produto: venda.getListaProdutos()) {
			System.out.println("Descrição " + produto);
		}
		
		
		System.out.println(venda);
		System.out.println("Descrição da Venda: " + venda.getDescricaoVenda());
		System.out.println("Endereço: " + venda.getEnderecoEntrega());
		
	}


}
