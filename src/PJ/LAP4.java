package PJ;

import java.util.Scanner;

public class LAP4 {

	public static void main(String[] args) {
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("Enter our Scores : ");
		int Scores = sc3.nextInt();
		
		if(Scores >= 80) {
			System.out.println("A");
		}else if (Scores >= 70) {
			System.out.println("B");
		}else if (Scores >= 60) {
			System.out.println("C");
		}else if (Scores >= 50) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		sc3.close();

	}

}
