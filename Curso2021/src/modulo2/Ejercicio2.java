package modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bmin = -128;
		byte bmax = 127;
		//reemplazar el 0 por el valor que corresponda en todos los caso short smin = 0;
		short smin = (short) (Math.pow(2, 15) * (-1));
		short smax = (short) (Math.pow(2, 15) -1);
		int imax = (int) (Math.pow(2, 31) -1);
		int imin = (int) (Math.pow(2, 31) * (-1));
		long lmin = (long) (Math.pow(2, 63) * (-1));
		long lmax = (long) Math.pow(2, 63); 
		System.out.println("tipo\tminimo\tmaximo"); 
		System.out.println("....\t......\t......"); 
		System.out.println("\nbyte\t" + bmin + "\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t" + smax);
		System.out.println("\nint\t" + imin + "\t" + imax);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);
		
		//Usando la formula en el codigo superior^

	}

}
