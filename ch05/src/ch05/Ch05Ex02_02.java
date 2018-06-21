package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]) + Integer.parseInt(numbers[4]);
		
		System.out.printf("%d", sum);
	}

}
