package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		int input;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);

		if (input < 0) {
			System.out.println(+input);
			System.out.println("minus");
		} else {
			System.out.println(+input);
		}
	}
}
