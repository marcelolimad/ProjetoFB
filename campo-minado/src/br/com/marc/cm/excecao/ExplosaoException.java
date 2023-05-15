package br.com.marc.cm.excecao;

public class ExplosaoException extends RuntimeException{

   public ExplosaoException() {
	msgExplosao();
}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	void msgExplosao() {
		System.out.println("Explodiu otariooooooooo");
	}

}
