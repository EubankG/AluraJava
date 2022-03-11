
public class TesteReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
			
		
		g1.setSalario(5000);
		g1.setNome("Guilherme");
		System.out.println(g1.getNome());
			
		EditorVideo e = new EditorVideo();
		e.setSalario(3000);
		
		ControleBonifecacao contro = new ControleBonifecacao();
		
		contro.regristra(g1);
		
		contro.regristra(e);
		
		System.out.println(contro.getSoma());
	}

}
