package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();
		
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		int c = Integer.parseInt(input3);
		
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println(b);
		} else if (c < a && c < b) {
			System.out.println(c);
		}
	}

}
