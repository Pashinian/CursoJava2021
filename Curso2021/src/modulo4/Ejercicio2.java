package modulo4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resto;
		
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Introduce un numero: ");
	    int numero = myObj.nextInt(); 
	    
	    resto = numero % 2;
	    
	    if(resto == 0) {
	    	System.out.println("Numero Par");
	    }
	    
	    else {
	    	System.out.println("Numero Impar");
	    }

	}

}
