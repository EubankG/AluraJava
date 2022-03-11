
public class Client implements Autenticavel {

	private AutenticacaoUtil autenticador; 
	
	
	public Client() {
		this.autenticador = new AutenticacaoUtil();
	}
	@Override
	
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.autenticador.setSenha(senha) ;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	


}
