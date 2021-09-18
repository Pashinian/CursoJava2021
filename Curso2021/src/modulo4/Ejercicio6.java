package modulo4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("En que curso estas (0-12): ");
		System.out.println("");
		int curso = input.nextInt();

		if (curso == 0) {
			System.out.println("Jardin de Infantes");
		} else if (curso >= 1 && curso <= 6) {
			System.out.println("Primaria");
		} else if (curso >= 7 && curso <= 12) {
			System.out.println("Secundaria");
		}

	}

}
