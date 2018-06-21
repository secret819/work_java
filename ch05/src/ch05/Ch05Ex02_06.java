package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char[] apple = {'A', 'P', 'P', 'L', 'E', '!'};

		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);
		
		for (int i = 0; i < apple.length; i++) {
			if (apple[i] == ch) {
				System.out.println(i);
				break;
			}
			else if (i == apple.length - 1) {
			System.out.println("none");
			}
		}
	}

}
