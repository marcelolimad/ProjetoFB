package classesauxiliares;

import interfaces.Acesso;

/*S� quem tem acesso interface acesso*/
public class FuncaoAutenticacao {
	
	
	private Acesso acesso;
	
	public boolean autenticar() {
		return acesso.autenticar();
	}
	
	public FuncaoAutenticacao (Acesso acesso) {
		this.acesso = acesso;
	}
	
	}


