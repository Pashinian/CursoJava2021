package modulo4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce un numero para saber tu grupo: ");
		System.out.println("");
		int num1 = input.nextInt(); 
		
		if(num1 >= 1 && num1 <= 12) {
			System.out.println("Perteneces al grupo (Primera Docena) ");
		}
		else if(num1 >= 13 && num1 <= 24) {
			System.out.println("Perteneces al grupo (Segunda Docena) ");
		}
		else if(num1 >= 25 && num1 <= 36) {
			System.out.println("Perteneces al grupo (Tercera Docena) ");
		}
		else {
			System.out.println("El numero " + num1 + " esta fuera de rango");
		}

	}

}
