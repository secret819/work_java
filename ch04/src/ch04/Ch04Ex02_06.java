package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number?");
			
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			if (a == 1) {
				System.out.println();
				System.out.println("Seoul");
			} else if (a == 2) {
				System.out.println();
				System.out.println("Washington");
			} else if (a == 3) {
				System.out.println();
				System.out.println("Tokyo");
			} else if (a == 4) {
				System.out.println();
				System.out.println("China");
			} else {
				System.out.println();
				System.out.println("none");
				break;
			}
		}
	}

}
