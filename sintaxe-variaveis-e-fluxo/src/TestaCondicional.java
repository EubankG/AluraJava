
public class TestaCondicional {
	public static void main(String[] args) {

		System.out.println(" Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println(" Voc� tem mais que 18 anos");
		} else if(quantidadePessoas >= 2) {
			System.out.println(" Voc� � menor de idade,"
					+ " mas pode entrar , pois est� acompanhado");
		} else { 
			System.out.println(" Voc� n�o pode entrar , pois � menor de idade");
		}

	}
}
