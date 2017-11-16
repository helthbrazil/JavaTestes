import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TesteRomano {

	@Test
	public void testeConversaoUnidade() throws Exception {
		ConversorRomano conversor = new ConversorRomano();
		String romano = conversor.converterUnidades(9);
		Assert.assertEquals("IX", romano);
	}
	
	@Test
	public void testeConversaoDezena() throws Exception {
		ConversorRomano conversorRomano = new ConversorRomano();
		String romano = conversorRomano.converterDezenas(99);
		Assert.assertEquals("XCIX", romano);
	}
	
	@Test
	public void testeConversaoCentena() throws Exception {
		ConversorRomano conversorRomano = new ConversorRomano();
		String romano = conversorRomano.converterCentena(900);
		Assert.assertEquals("CM", romano);
	}
	
	@Test
	public void testeConversaoMilhar() throws Exception {
		ConversorRomano conversorRomano = new ConversorRomano();
		String romano = conversorRomano.converterMilhar(3999);
		Assert.assertEquals("MMMCMXCIX", romano);
	}

}
