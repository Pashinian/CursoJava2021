package modulo4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String frase = "";

		System.out.print("Introduzca su posicion: ");
		int posicion = input.nextInt();

		if (posicion >= 1 && posicion <= 3) {
			switch (posicion) {
			case 1:
				frase = "El primero obtiene la medalla de oro.";
				break;
			case 2:
				frase = "El segundo obtiene la medalla de plata.";
				break;
			case 3:
				frase = "Y el tercero obtiene la medalla de bronce.";
				break;

			}
			System.out.println("");
			System.out.print(frase);
		} else {
			System.out.println("Y para el resto siga participando.");
		}

	}

}
