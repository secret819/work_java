package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		while (a <= 100 && a > i) {
			sum += i;
			i++;
			
		}
		total = sum + a;
		System.out.println(total);
	}

}
