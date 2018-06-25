package ch05;

import java.util.Scanner;

public class csh04 {
	public static void main(String[] args) {
		int[] num = new int[100];

		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		for (int i = 0; i < numbers.length; i++) {

			num[i] = Integer.parseInt(numbers[i]);
			
			if (num[i] == 0) {
				break;
			}

			
		}

		for (int i = numbers.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				System.out.print(num[i] + " ");
			}
		}
	}

}
