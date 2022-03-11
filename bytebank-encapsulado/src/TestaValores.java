
public class TestaValores {
	public static void main(String[] args) {
		 Conta conta = new Conta("guilherme");
		 
		 //conta está inconsistente 
		
		  System.out.println(conta.getNumero());
		  System.out.println(conta.getAgencia());
		  Conta conta2 = new Conta(13372,24226);
		  Conta conta3 = new Conta(1337,24226);
		  
		  System.out.println(Conta.getTotal());
	
	}	
}
