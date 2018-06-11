package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.printf("%d ", j * i);
			}
			System.out.println();
		}
	}

}
