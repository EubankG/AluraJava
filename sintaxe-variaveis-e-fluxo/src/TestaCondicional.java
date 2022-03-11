
public class TestaCondicional {
	public static void main(String[] args) {

		System.out.println(" Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println(" Você tem mais que 18 anos");
		} else if(quantidadePessoas >= 2) {
			System.out.println(" Você é menor de idade,"
					+ " mas pode entrar , pois está acompanhado");
		} else { 
			System.out.println(" Você não pode entrar , pois é menor de idade");
		}

	}
}
