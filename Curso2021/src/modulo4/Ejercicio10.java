package modulo4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//utlizo and en el IF
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		System.out.println("");
		int num1 = input.nextInt(); 
		System.out.print("Introduce el segundo numero: ");
		System.out.println("");
		int num2 = input.nextInt();
		System.out.print("Introduce el tercer numero: ");
		System.out.println("");
		int num3 = input.nextInt(); 
		
		if(num1>num2 && num1>num3) {
			System.out.println("El mayor numero es "+num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("El mayor numero es "+num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("El mayor numero es "+num3);
		}

	}

}
