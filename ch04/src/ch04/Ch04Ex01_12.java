package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);

		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}

}
