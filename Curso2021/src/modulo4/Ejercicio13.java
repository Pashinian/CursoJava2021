package modulo4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// realizado con Switch

		Scanner input = new Scanner(System.in);

		int numeroDias = 0;
		String nombreMes = "";

		System.out.print("Introduce un mes en numero: ");
		int month = input.nextInt();

		switch (month) {
		case 1:
			nombreMes = "Enero";
			numeroDias = 31;
			break;
		case 2:
			nombreMes = "Febrero";
			numeroDias = 28;
			break;
		case 3:
			nombreMes = "Marzo";
			numeroDias = 31;
			break;
		case 4:
			nombreMes = "Abril";
			numeroDias = 30;
			break;
		case 5:
			nombreMes = "Mayo";
			numeroDias = 31;
			break;
		case 6:
			nombreMes = "Junio";
			numeroDias = 30;
			break;
		case 7:
			nombreMes = "Julio";
			numeroDias = 31;
			break;
		case 8:
			nombreMes = "Agosto";
			numeroDias = 31;
			break;
		case 9:
			nombreMes = "Septiembre";
			numeroDias = 30;
			break;
		case 10:
			nombreMes = "Octubre";
			numeroDias = 31;
			break;
		case 11:
			nombreMes = "Noviembre";
			numeroDias = 30;
			break;
		case 12:
			nombreMes = "Diciembre";
			numeroDias = 31;
		}
		System.out.println("");
		System.out.print(nombreMes + " tiene " + numeroDias + " dias.");
	}

}
