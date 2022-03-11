
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente guilherme = new Gerente();
		
		guilherme.setNome("guilherme");
		guilherme.setSalario(1200);
		
		System.out.println(guilherme.getNome()); 
		System.out.println(guilherme.getBonificacao()); 

	}

}
