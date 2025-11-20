package PJ;

import java.util.Scanner;

public class LAP2 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter first width : ");
		double width = sc1.nextDouble();

		System.out.println("Enter second height : ");
		double height = sc1.nextDouble();
        
        double area = width * height;

        System.out.println("area = " + area);
        
        sc1.close();

	}

}
