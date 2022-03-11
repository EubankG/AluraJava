
public class SistemaInterno {
	private int senha;	
	
	public void setColocar(int senha) {
		this.senha = senha;
	}
	
	public void autentica(Autenticavel fa) { 
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("True"); 
		}else {
			System.out.println("Falso");
		}
		
	}
	
}
