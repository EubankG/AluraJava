//Gerente herda da class funcionario.

public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador; 
	
	public Gerente() {
		  
	}
	
	@Override
	public double getBonificacao() {
		//super significa que o atributo salario vem da classe m?e = Funcionario. 
		return super.getSalario(); 
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha) ;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
}
