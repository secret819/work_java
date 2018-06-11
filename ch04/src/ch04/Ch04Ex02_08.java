package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
						
			if (a == 0) {
				break;
			} else if (a % 2 != 0) {
				odd++;
			} else if (a % 2 == 0) {
				even++;
			}
		}
		System.out.println("odd : "+ odd);
		System.out.println("even : " + even);
	}

}
