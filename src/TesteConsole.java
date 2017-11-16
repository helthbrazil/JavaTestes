import java.util.Scanner;

public class TesteConsole {
	public static int decimal = 0;
	public static Scanner consoleInput = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sair = false;
		System.out.println("CONVERSOR DE NÚMEROS DECIMAIS PARA ALGARISMOS ROMANOS \r\n");
		ConversorRomano conversorRomano = new ConversorRomano();
		decimal = 0;
		while (!sair) {
			try {
				processar(conversorRomano);
				sair = obterRespostaSaida();

			} catch (Exception e) {
				System.out.println();
				System.out.println(e.getMessage());
				System.out.println();
				decimal = 0;
			} 
		}
	}

	public static void processar(ConversorRomano conversorRomano) throws Exception {
		System.out.println("Informe um número entre 1 e 3999");

		decimal = consoleInput.nextInt();
		consoleInput.nextLine();
		String resultado = conversorRomano.converterDecimalToRomano(decimal);
		System.out.println("Resultado: " + decimal + " -> " + resultado + "\r\n");
	}

	public static boolean obterRespostaSaida() {
		System.out.println("Deseja sair? ('s' para sim e 'n' para não)");
		String resposta = consoleInput.nextLine();
		if (resposta.toLowerCase().equals("s")) {
			return true;
		} else {
			System.out.println();
			return false;
		}
	}
}
