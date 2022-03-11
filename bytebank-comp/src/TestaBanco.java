
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		// setar atributos de objetos = popular 
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = " Programador";
		
		Conta contaDoPaulo = new Conta();
		
		//associa o cliente paulo a conta contaDoPaulo
		contaDoPaulo.titular = paulo; 
		System.out.println(contaDoPaulo.titular.nome);
	}
}
