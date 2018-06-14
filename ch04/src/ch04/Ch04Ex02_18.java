package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j > i)
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}


