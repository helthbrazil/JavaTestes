import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConversorRomano {
	private List<Algarismo> algarismos;

	public ConversorRomano() {
		this.algarismos = new ArrayList();
		this.inicializarAlgarismos();
	}

	private void inicializarAlgarismos() {
		this.algarismos.add(new Algarismo(1, "I"));
		this.algarismos.add(new Algarismo(5, "V"));
		this.algarismos.add(new Algarismo(10, "X"));
		this.algarismos.add(new Algarismo(50, "L"));
		this.algarismos.add(new Algarismo(100, "C"));
		this.algarismos.add(new Algarismo(500, "D"));
		this.algarismos.add(new Algarismo(1000, "M"));
	}

	public String converterUnidades(int unidades) throws Exception {
		String resultado = "";
		if (unidades >= 10 || unidades <= 0) {
			throw new Exception("Unidade inválida");
		}

		int indiceReferencia = 0;

		for (int i = 0; i < algarismos.size(); i++) {
			if (algarismos.get(i).getValor() > unidades) {
				indiceReferencia = i;
				break;
			}
		}

		if (algarismos.get(indiceReferencia).getValor() - algarismos.get(0).getValor() == unidades) {
			return algarismos.get(0).getAlgarismo() + algarismos.get(indiceReferencia).getAlgarismo();
		} else {
			resultado = algarismos.get(indiceReferencia - 1).getAlgarismo();
			int valor = algarismos.get(indiceReferencia - 1).getValor();
			int resto = unidades - valor;
			for (int i = 0; i < resto; i++) {
				resultado += algarismos.get(0).getAlgarismo();
			}

		}

		return resultado;
	}

	public String converterDezenas(int dezena) throws Exception {
		String resultado = "";
		if (dezena < 10 || dezena > 99) {
			throw new Exception("Dezena inválida");
		}

		int dezenaControle = dezena / 10;
		int mod = dezena % 10;

		if (dezenaControle < 4) {
			for (int i = 0; i < dezenaControle; i++) {
				resultado += algarismos.get(2).getAlgarismo();
			}
		} else if (dezenaControle == 4) {
			resultado = algarismos.get(2).getAlgarismo() + algarismos.get(3).getAlgarismo();
		} else if (dezenaControle == 5) {
			resultado = algarismos.get(3).getAlgarismo();
		} else if (dezenaControle > 5 && dezenaControle < 9) {
			resultado = algarismos.get(3).getAlgarismo();
			for (int i = 0; i < 3; i++) {
				resultado += algarismos.get(2).getAlgarismo();
			}
		} else {
			resultado = algarismos.get(2).getAlgarismo() + algarismos.get(4).getAlgarismo();
		}

		if (mod != 0) {
			resultado += converterUnidades(mod);
		}

		return resultado;
	}

}
