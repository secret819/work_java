package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		int[] numbers = new int[100];

		int max = 0;
		int min = 0;

		for (int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			numbers[i] = num;

			if (numbers[i] >= 1000 || numbers[i] == 999) {
				break;
			} else if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min && numbers[i] < max) {
				min = numbers[i];
			}
		}

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}


