package ch04;

import java.util.Scanner;

public class Ch04Ex02_07 {
	public static void main(String[] args) {
		int b = 1;
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		while (true) {
						
			if (a >= b) {
				System.out.print(b + " ");
				b++;
			} else {
				break;
			}
			
		}
		
	}

}
