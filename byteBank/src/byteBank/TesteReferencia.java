package byteBank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		System.out.println("Saldo segunda conta: " + segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("Mesma cota");
		} else {
			System.out.println("Conta diferentes");
		}

	}
}
