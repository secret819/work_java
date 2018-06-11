package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		
		if (a > b) {
			System.out.printf("%d", a - b);
		} else if (b > a) {
			System.out.printf("%d", b - a);
		}
	}

}
