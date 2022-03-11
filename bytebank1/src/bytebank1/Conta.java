package bytebank1;

public class Conta {
	//A PARTIR DA CLASSE A GENTE CRIA UM OBJETO 

	// class palavra do java que define um tipo
	//Especifica��o de conta 
	//Saldo, agencia , numero , titulur s�o atributos. 
	double saldo; 
	int agencia; 
	int numero;
	String titular; 
	String profissao; 
	String cpf; 
	
	//isso � um metodo 
	// Void � o ele retorna 
	// entre () � oque ele recebe de informa��o 
	
	// deposita � o nome do metodo
	// void � oque ele retorna 
	// (parametros) � oque ele recebe 
	
	// metodos s�o a maneira de fazer alguma coisa dentro de conta 
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

}