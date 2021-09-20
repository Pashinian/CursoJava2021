package modulo4;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mult = 0;
		for (int tabla = 0; tabla < 11; tabla++) {
			for (int num = 0; num < 11; num++) {
				mult = tabla * num;
				System.out.println(tabla + " X " + num + " = " + mult);
			}
			System.out.println("");
		}

	}

}
