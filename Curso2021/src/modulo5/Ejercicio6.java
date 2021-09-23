package modulo5;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prueba = "gcasas1972@gmail.com";
		int numeros = 0;

		for (int i = 0; i < prueba.length(); i++) {
			char ch = prueba.charAt(i);
			if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
					|| ch == '9' || ch == '0') {
				numeros++;
			}

		}
		if (numeros > 0) {
			System.out.println("Esta cadena contiene numeros.");
		} else {
			System.out.println("Esta cadena no contiene numeros.");

		}

	}
}
