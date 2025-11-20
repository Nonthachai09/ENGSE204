package PJ;

import java.util.Scanner;

public class LAP6 {

	public static void main(String[] args) {
		
		Scanner sc5 = new Scanner(System.in);
		
		System.out.print("Input multiplication table : ");
		int mtb = sc5.nextInt();
		
		for(int i = 1; i <= 12; i++ ) {
			int sum = mtb * i ;
			System.out.println(mtb + " x " + i + " = " + sum);
		}
		
		sc5.close();
	}

}
