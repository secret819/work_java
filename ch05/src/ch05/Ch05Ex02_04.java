package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if (num == -1) {
				break;
			}
			
			numbers[i] = num;
			count++;
		}
		
		// 마지막 세 개의 정수를 출력
		for (int i = count - 3; i < count; i++) {
			System.out.printf("%d ", numbers[i]);
		}
	}

}
