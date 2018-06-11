package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		if (a > 0) {
			System.out.println("plus");
		} else if (a < 0) {
			System.out.println("minus");
		} else {
			System.out.println("zero");
		}
		
	}
}
