package PJ;

import java.util.Scanner;

public class LAP5 {

	public static void main(String[] args) {

		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("------- Menu ------");
		System.out.println("-----Americano-----");
		System.out.println("-----  Latte -----");
		System.out.println("----- Espresso -----");
		System.out.println("-----  Mocha -----");
		System.out.println("------- Menu ------");
		System.out.print("Input 1 Manu : ");
		int numbermanu = sc4.nextInt();
		
		if (numbermanu == 1) {
			System.out.println("Americano");
		}else if (numbermanu == 2) {
			System.out.println("Latte");
		}else if (numbermanu == 3) {
			System.out.println("Espresso");
		}else if (numbermanu == 4) {
			System.out.println("Mocha");
		}else {
			System.out.println("Invalid Menu");
		}
		
		sc4.close();

	}

}
