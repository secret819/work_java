package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		double triangleArea = 0;
		char c;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Base = ");						
			
			Scanner input3 = new Scanner(System.in);
			String input = scanner.nextLine();			

			System.out.print("height = ");
			String input2 = scanner.nextLine();
			int base = Integer.parseInt(input);
			int height = Integer.parseInt(input2);
			
			
			System.out.println("Triangle area = " + base * (double)height / 2);
			System.out.print("Continue? ");
			
			
			c = input3.next().charAt(0);
			System.out.println();
						
			if (c == 'y' || c == 'Y') {
				continue;
			}
		}
	}

}
