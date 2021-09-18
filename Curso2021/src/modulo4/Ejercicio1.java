package modulo4;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int nota1 = 8;
		int nota2 = 7;
		int nota3 = 8;
		int media = 0;
		
		media = (nota1 + nota2 +nota3)/3;
		System.out.println("Su nota media es " + media);
		System.out.println("-------------------");
		
		if(media < 7) {
			System.out.println("SUSPENSO");
		}
		else {
			System.out.println("APROBADO");
		}

	}

}
