package modulo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> nums = new ArrayList<Double>();
		int count = 0;
		double num = 0;
		do {
			num = Math.random();
			nums.add(num);
			count ++;

		} while (count < 11);

		System.out.println("La lista de valores es: " + nums);
		System.out.println("El mayor numero es: " + Collections.max(nums));
		System.out.println("El menor numero es: " + Collections.min(nums));
		
	}

}
