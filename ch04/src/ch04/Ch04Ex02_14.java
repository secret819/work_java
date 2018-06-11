package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= a - b + 1; j++) {
				if ((a > 1 && a < 10) && (b > 1 && b < 10)) {
					System.out.printf("%d * %d =%3d\t", a + 1 - j, i, (a + 1 - j) * i);
				} else {
					break;
				}
			}
			System.out.println();
		}
	}

}
