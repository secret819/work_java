package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int n = Integer.parseInt(input);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n <= 6) {
					System.out.printf("%c", i);
				}				
			}
			System.out.println();
		}
	}

}
