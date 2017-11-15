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
	public void testeConversaoDezenda() throws Exception {
		ConversorRomano conversorRomano = new ConversorRomano();
		String romano = conversorRomano.converterDezenas(94);
		Assert.assertEquals("XCIV", romano);
	}

}
