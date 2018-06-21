package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int sum01 = 0;
		int sum02 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				sum01 += Integer.parseInt(numbers[i]);
			}
			else {
				sum02 += Integer.parseInt(numbers[i]);
			}
		}
		
		System.out.println("odd : " + sum01);
		System.out.println("even : " + sum02);
	}

}
