package modulo4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Utilizando and en el IF
		Scanner input = new Scanner(System.in);
		System.out.print("Jugador 1 elige Piedra(0), Papel(1), Tijera(2): ");
		System.out.println("");
		int jugador1 = input.nextInt(); 
		System.out.print("Jugador 2 elige Piedra(0), Papel(1), Tijera(2): ");
		System.out.println("");
		int jugador2 = input.nextInt();
		
		if(jugador1 == 0 && jugador2 == 1) {
			System.out.println("Gana el jugador 2");
		}
		else if(jugador1 == 1 && jugador2 == 2) {
			System.out.println("Gana el jugador 2");
		}
		else if(jugador1 == 2 && jugador2 == 0) {
			System.out.println("Gana el jugador 2");
		}
		else{
			System.out.println("Gana el jugador 1");
		}

	}

}
