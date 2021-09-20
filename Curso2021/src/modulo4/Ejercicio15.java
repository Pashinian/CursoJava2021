package modulo4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Elija la categoria del auto (a, b, c): ");
        System.out.println("");
        c = scan.next().charAt(0);
        String frase = "";

		if (c == 'a' || c == 'b' || c == 'c') {
			switch (c) {
			case 'a':
				frase = "Clase A tiene 4 ruedas y un motor.";
				break;
			case 'b':
				frase = "Clase B tiene 4 ruedas, motor, cierre centralizado y aire.";
				break;
			case 'c':
				frase = "Clase C tiene 4 ruedas, motor, cierre centralizado, aire y airbag.";
				break;

			}
			System.out.println("");
			System.out.print(frase);
		} else {
			System.out.println("La clase indicada no existe.");
		}

	}

}
