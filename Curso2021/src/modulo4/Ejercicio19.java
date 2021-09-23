package modulo4;

import java.util.Random;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int suma = 0;
		int media = 0;
		Random rand = new Random();
		int upperbound = 100;
		System.out.println("Los numeros son: ");
		while (count < 11) {
			int num = rand.nextInt(upperbound);
			System.out.println(num);
			suma = suma + num;
			media = suma / 10;
			count++;
		}
		System.out.println("");
		System.out.println("Su suma es: ");
		System.out.println(suma);
		System.out.println("");
		System.out.println("La media es: ");
		System.out.println(media);
	}

}
