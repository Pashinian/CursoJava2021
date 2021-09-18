package modulo4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce una opcion (a, b, c):  ");
		System.out.println("");
		String grupo = input.nextLine(); 

		if (grupo.equals("a")) {
			System.out.println("Hijos");
		} else if (grupo.equals("b")) {
			System.out.println("Padres");
		} else if (grupo.equals("c")) {
			System.out.println("Abuelos");

		}

	}
}