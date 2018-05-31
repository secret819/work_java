package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		int c = Integer.parseInt(input3);
		
		System.out.printf("%b %b%n", b < a && c < a, a == b && b == c && c == a);
	}

}
