package jUnit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



// Junit Nome da classe + Test
public class CalculadoraTest {
	
	
	@Test
	public void deveriaSomarDoisNumerosPosivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10,soma);
	}
	
	@Test 
	public void deveriaMultiplicarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int multiplicacao = calc.multicacao(2, 2);
		
		Assert.assertEquals(4,multiplicacao);
	}

}
