package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		if (a == 1) {
			System.out.println("dog");
		} else if (a == 2) {
			System.out.println("cat");
		} else if (a == 3) {
			System.out.println("chick");
		} else {
			System.out.println("I don`t know.");
		}
	}

}
