
public class ControleBonifecacao {
	private double soma; 
	
	public void regristra(Funcionario f) { 
		double boni = f.getBonificacao();
		this.soma = this.soma + boni; 
	}
	
	
	public double getSoma() {
		return soma;
	}
	
}
