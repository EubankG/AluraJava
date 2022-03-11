

public class TesteSistema {
	public static void main(String[] args) {
		AutenticacaoUtil au = new AutenticacaoUtil();
		Gerente g = new Gerente();
		SistemaInterno si = new SistemaInterno();
		Administrador adm = new Administrador();
		
		si.setColocar(2222);
		g.setSenha(222);
		au.setSenha(2222);
		adm.autentica(0);
	 
		
		si.autentica(g);
		si.autentica(adm);
	}
}
