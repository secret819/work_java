package ch05;

import java.util.Scanner;

public class csh09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		int[] sort = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			sort[i] = Integer.parseInt(numbers[i]);
		}
		
		for (int i = 0; i < sort.length - 1; i++) {
			boolean changed = false;
			
			for (int j = 0; j < sort.length -1 - i; j++) {
				if (sort[j] > sort[j + 1]) {
					int temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					changed = true;
				}
			}
			
			if (!changed) {
				break;
			}
		}
		
		for (int i = sort.length - 1; i >= 0; i--) {
			System.out.print(sort[i] + " ");
		}
	}

}
