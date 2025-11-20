package PJ;

import java.util.Scanner;

public class LAP3 {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Enter our Number : ");
		int Number = sc2.nextInt();
		
		if (Number % 2 == 0) {
			System.out.println(Number + " Even");
		}else {
			System.out.println(Number + " Odd");
		}
		
		sc2.close();

	}

}
