package byteBank;

//Objeto ou instacia do tipo Conta
public class CriaConta {
	
	public static void main(String[] args) {
		
		//Instacia ou constroi um objeto do tipo conta 
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		//+= os 200 da conta + 100
		primeiraConta.saldo += 100;
		
		//referencia a um objeto .atributo = primeiraConta.saldo 
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("primeira conta tem " + segundaConta.saldo);
		
		// quando o java cria/instacia objetos , seus valores sao zerados 
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma cota");
		} else { 
			System.out.println("Conta diferentes");
		}
		
	}
}
 