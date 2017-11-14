import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ConversorRomano {
	private Map<Integer, String> algarismos;

	public ConversorRomano() {
		inicializarAlgarismos();
	}

	public void inicializarAlgarismos() {
		this.algarismos = new HashMap<>();
		this.algarismos.put(1, "I");
		this.algarismos.put(5, "V");
		this.algarismos.put(10, "X");
		this.algarismos.put(50, "L");
		this.algarismos.put(100, "C");
		this.algarismos.put(500, "D");
		this.algarismos.put(100, "M");
	}

	public String converterNumero(Integer numero) {

		int check = numero;

		while (check > 0) {

		}

		return this.algarismos.get(numero);
	}

	public void buscarMaiorAlgarismoQueAtenda(int numero) {
		Iterator it = this.algarismos.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}

	public Integer verificarAlgarismo(String algarismo) {
		String algarismoFormatado = algarismo.toUpperCase();

		for (Entry<Integer, String> entry : this.algarismos.entrySet()) {
			if (entry.getValue().equals(algarismoFormatado)) {
				return entry.getKey();
			}
		}
		return null;
	}

}
