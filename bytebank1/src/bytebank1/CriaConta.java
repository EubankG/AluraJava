package bytebank1;

public class CriaConta {
	public static void main(String[] args) { 
		//A PARTIR DA CLASSE A GENTE CRIA UM OBJETO 
		//inicialização da conta como referencia de conta 
		// primeiraConta e uma variavel de conta
		// primeiraConta é um objeto 
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 01;
		primeiraConta.numero = 1578494;
		primeiraConta.titular = "Guilherme"; 
		
		// += eu atribuo + 100 a saldo = 200 + 100 
		primeiraConta.saldo += 100;
		
		System.out.println("A conta do " + primeiraConta.titular + " tem "
			+ "R$" + primeiraConta.saldo);
		//primeira conta é a referencia ,Segunda conta é o endereço de memoria da conta
		Conta segundaConta = new Conta(); 
		segundaConta.saldo = 500;
		
		System.out.println("Primeira conta tem R$" + segundaConta.saldo);
		System.out.println("Segunda conta tem R$" + segundaConta.saldo);
		
		//Quando o java instancia objetos os seus atributos são zerados 
		System.out.println(segundaConta.numero);
		System.out.println(segundaConta.agencia);
		
		
	}
}
