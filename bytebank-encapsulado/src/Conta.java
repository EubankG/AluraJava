public class Conta {
	//A PARTIR DA CLASSE A GENTE CRIA UM OBJETO 

	// class palavra do java que define um tipo
	//Especifica��o de conta 
	//Saldo, agencia , numero , titulur s�o atributos. 
	private double saldo; 
	private int agencia; 
	private	int numero;
	private Cliente titular; 
	Cliente cpf;
	Cliente profissoa;
	// static � da classe 
	private static int total; 
	//Criando um construtor 
	public Conta(int agencia, int numero){
		total++;
		System.out.println("o total de contas � " + total);
		this.agencia = agencia; 
		this.numero = numero;
		
		System.out.println("Estou criando uma conta");
	}
	
	public Conta(String titular) {
		this.titular = getTitular();
	}
	
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
	
	public double getSaldo() { 
		return this.saldo; 
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("n�o poder ser menor que 0");
			return; 
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor tem que ser maior que 0");
			return; 
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}