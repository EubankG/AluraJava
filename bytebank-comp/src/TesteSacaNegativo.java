
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		// Ideal é trabalho atraves de metodos ,NUNCA COM ATRIBUTOS. 
		conta.deposita(100);
		System.out.println(conta.saca(101));
		//System.out.println(conta.saldo);
		
		//PROIBIDO
		//Atributo privado não pode ser lido ou movificado a não ser por classes a ela mesmo
		//conta.saldo = conta.saldo - 101;
		
		System.out.println(conta.getSaldo());
		
	}
}
