package byteBank;
//especificação de conta 

public class Conta {
	// caracteristicas de um objeto 
	//Atributos 
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// metodos 
//	Oque devolve  nome 	   parametros 
	public void deposita(double valor){
		this.saldo += valor; 
		System.out.println("Valor depositado: " + valor);
		System.out.println("Valor da conta: " + saldo);
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor da conta " + saldo);
			return true;
		} else {
			System.out.println("Valor de saquer " + valor + " maior que o seu saldo " + saldo);
			return false; 
		}
	}
	
	public boolean tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor; 
			destino.deposita(valor);
			System.out.println("Valor atual da sua conta: " + saldo);
			return true;
		} else {
			return false; 
		}
		
	}
}
