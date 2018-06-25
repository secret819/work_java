package ch05;

import java.util.Scanner;

public class csh08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int even = 0;
		int odd = 0;
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			if (i % 2 == 0) {
				odd += num;
				count++;
			}
			else {
				even += num;
			}
		}
		
		System.out.printf("sum : %d%n", even);
		System.out.printf("avg : %.1f", (double)odd / count);
	}

}
