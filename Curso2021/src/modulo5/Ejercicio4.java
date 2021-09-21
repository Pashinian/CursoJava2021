package modulo5;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;

		String prueba = "Esto es una prueba de clase string";

		for (int i = 0; i < prueba.length(); i++) {
			char ch = prueba.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
				numero++;
			}

		}
		System.out.println("Numero de vocales " + numero);
	}
}
