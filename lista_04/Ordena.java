package lista_04;

import java.util.Arrays;

public class Ordena {

	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			int[] numeros = new int[args.length];

			for (int i = 0; i < args.length; i++) {
				numeros[i] = Integer.parseInt(args[i]);
			}

			Arrays.sort(numeros);
			System.out.println("\nO array ordenado �: ");
			for (int num : numeros) {
				System.out.print(num + " ");
			}
		}
	}

}
