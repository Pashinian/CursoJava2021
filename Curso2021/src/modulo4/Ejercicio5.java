package modulo4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca su posicion: ");
		System.out.println("");
		int posicion = input.nextInt();

		if (posicion == 1) {
			System.out.println("El primero obtiene la medalla de oro.");
		} else if (posicion == 2) {
			System.out.println("El segundo obtiene la medalla de plata.");
		} else if (posicion == 3) {
			System.out.println("Y el tercero obtiene la medalla de bronce.");
		}
		else {
			System.out.println("Y para el resto siga participando.");
		}

	}

}
