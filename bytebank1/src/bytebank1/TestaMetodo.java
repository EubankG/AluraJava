package bytebank1;

public class TestaMetodo {
	public static void main(String[] args) {
		// É comum dar o nome da classe  o mesmo da variavel só que conta do letra 
		
	Conta contaDoPaulo = new Conta();
	
	contaDoPaulo.saldo = 100;
	contaDoPaulo.deposita(50);
	
	System.out.println(contaDoPaulo.saldo); 
	
	contaDoPaulo.saca(50);
	System.out.println(contaDoPaulo.saldo); 
	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.saldo = 500;
	
	contaDoPaulo.transfere(100, contaDaMarcela);
	
	System.out.println(contaDaMarcela.saldo);
	System.out.println(contaDoPaulo.saldo);	
	
	}
}