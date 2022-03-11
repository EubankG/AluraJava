public class Conta {
	//A PARTIR DA CLASSE A GENTE CRIA UM OBJETO 

	// class palavra do java que define um tipo
	//Especificação de conta 
	//Saldo, agencia , numero , titulur são atributos. 
	private double saldo; 
	int agencia; 
	int numero;
	Cliente titular; 
	Cliente cpf;
	Cliente profissoa;
	
	//isso é um metodo 
	// Void é o ele retorna 
	// entre () é oque ele recebe de informação 
	
	// deposita é o nome do metodo
	// void é oque ele retorna 
	// (parametros) é oque ele recebe 
	
	// metodos são a maneira de fazer alguma coisa dentro de conta 
	public void deposita(double valor) {
		this.saldo = this.saldo + valor; 
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
	} else {
		return false;
	}
	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) { 
			this.saldo = this.saldo - valor; 
			destino.deposita(valor);
			return true;
		}else {
			return false; 
		}
		
	}
	
	public double getSaldo() { 
		return this.saldo; 
	}

}