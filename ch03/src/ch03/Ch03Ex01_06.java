package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		
		System.out.printf("%b %b%n", a != 0 && b != 0, a != 0 || b != 0);
	}

}
