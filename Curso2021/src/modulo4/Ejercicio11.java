package modulo4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una letra para saber si es vocal:  ");
        System.out.println("");
        c = scan.next().charAt(0);
      
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
        c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
        c == 'u' || c == 'U')
        {
            System.out.print("La letra introducida es una vocal :)");
        }
        else
        {
            System.out.print("La letra introducida no es una vocal :(");
        }

	}

}
