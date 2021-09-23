package modulo5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;

		String prueba = "gcasas1972@gmail.com";

		for (int i = 0; i < prueba.length(); i++) {
			char ch = prueba.charAt(i);
			if (ch == '@') {
				System.out.println("@ en posicion: " + numero);
			} else {
				numero++;
			}

		}
	}
}
