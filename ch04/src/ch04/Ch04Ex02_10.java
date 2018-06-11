package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			if (a == 0) {
				break;
			} else if (a % 3 == 0 || a % 5 == 0) {
				continue;
			} else {
				num++;
			}
		}
		System.out.println(num);
	}

}
