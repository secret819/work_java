package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		double mean = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			num++;
			sum += a;
			mean = Math.round(sum / (double)num * 10) / 10.0;
			
			if (a >= 100) {				
				break;
			}
			
		}
		System.out.println(sum);
		System.out.println(mean);
	}

}
