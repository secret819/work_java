package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		
		System.out.printf("4 > 5 --- %b%n", a > b);
		System.out.printf("4 < 5 --- %b%n", a < b);
		System.out.printf("4 >= 5 --- %b%n", a >= b);
		System.out.printf("4 <= 5 --- %b%n", a <= b);
	}

}
