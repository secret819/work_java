package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		int[] numbers = new int[100];

		int sum = 0;
		int count = 0;

		for(int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			numbers[i] = num;

			if (numbers[i] == 0) {
				break;
			} else if (numbers[i] % 5 == 0) {
				sum += numbers[i];
				count++;
			}
		}
		System.out.println("Multiples of 5 : " + count);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (double)sum / count);
	}

}
