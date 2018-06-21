package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if (num == 0) {
				break;
			}
			
			numbers[i] = num;
			count++;
			
			if (numbers[i] % 2 == 0) {
				numbers[i] /= 2;
			} else {
				numbers[i] *= 2;
			}
		}
		
		System.out.println(count);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				break;
			}
			System.out.print(numbers[i] + " ");
		}
	}

}
