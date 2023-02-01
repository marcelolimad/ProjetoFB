package principio.responsabilidade;

public class DadosConta {

	private String descricao;
	
	private double saldo = 8000;
	
	
	public void soma50() {
		saldo += 50;
	}
	
	public void diminui50() {
		saldo -= 50;
	}
	
	 public void sacarDinheiro (double saque) {
		 saldo -= saque;
		 
	 }
	
	 public void depositoDinhero (double deposito) {
		 saldo += deposito;
		 
	 }
	 
	 public double getSaldo() {
		 return saldo;
	 }
	 
	 public void setDescricao(String descricao) {
		 this.descricao = descricao;
	 }

	@Override
	public String toString() {
		return "DadosConta [descricao=" + descricao + ", saldo=" + saldo + "]";
	} 
	 
	 
}
