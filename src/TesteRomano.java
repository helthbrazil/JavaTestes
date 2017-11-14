import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TesteRomano {

	@Test
	public void testeConversao() {
		ConversorRomano conversor = new ConversorRomano();
		String numeroRomano = conversor.converterNumero(1);
		Assert.assertEquals("I", numeroRomano);
	}

	@Test
	public void verificarAlgarismoI() {
		ConversorRomano conversor = new ConversorRomano();
		int numero = conversor.verificarAlgarismo("i");
		Assert.assertEquals(1, numero);
	}
	
	@Test
	public void verificarAlgarismoV() {
		ConversorRomano conversor = new ConversorRomano();
		int numero = conversor.verificarAlgarismo("v");
		Assert.assertEquals(5, numero);
	}
	
	@Test
	public void verificarAlgarismoX() {
		ConversorRomano conversor = new ConversorRomano();
		int numero = conversor.verificarAlgarismo("X");
		Assert.assertEquals(10, numero);
	}

}
