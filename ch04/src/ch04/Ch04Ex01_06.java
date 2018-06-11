package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
        char c;
		
        Scanner input = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		c = input.next().charAt(0);
		String strAge = scanner.nextLine();

		int age = Integer.parseInt(strAge);

		if (age >= 18) {
			if (c == 'M') {
				System.out.println("MAN");
			} else if (c == 'F') {
				System.out.println("WOMAN");
			}
		} else if (age < 18) {
			if (c == 'M') {
				System.out.println("BOY");
			} else if (c == 'F') {
				System.out.println("GIRL");
			}
		}
	}
}