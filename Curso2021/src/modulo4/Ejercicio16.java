package modulo4;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca un numero para multiplicar: ");
		System.out.println("");
		int num = input.nextInt();
		int mult = 0;
		int i = 0;
		
		while (i != 11) {
			mult = num * i;
			System.out.println(num + " X " + i + " = " + mult);
			i++;
			
		}

	}

}
