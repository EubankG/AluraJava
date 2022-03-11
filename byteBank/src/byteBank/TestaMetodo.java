package byteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		// Esquerda sempre o nome da class, direita sempre o nome da variavel = Conta = classe conta = variavel. 
		Conta Guiconta = new Conta();
		Guiconta.saldo = 100;
		Guiconta.deposita(50);
		
		Guiconta.saca(150);
		
		Conta marcela = new Conta();
		marcela.saldo = 1000;
		if(marcela.tranfere(3000, Guiconta)) {
			System.out.println("tranferencia com sucesso");
			
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		
		System.out.println(marcela.saldo);
		System.out.println(Guiconta.saldo);
	}

}
