package PJ;

import java.util.Scanner;

public class LAP3 {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Enter our Number : ");
		double Number = sc2.nextDouble();
		
		if (Number % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		sc2.close();

	}

}
