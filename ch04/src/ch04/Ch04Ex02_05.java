package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			if (a == -1) {
				break;
			} else if (a % 3 != 0) {
				continue;
			} else if (a % 3 == 0) {
				System.out.println(a / 3);
			}
		}
	}

}
