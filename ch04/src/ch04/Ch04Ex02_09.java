package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			if (a == 0) {
				num++;
				continue;
			} else if (0 <= a && a <= 100) {
				num++;
				sum += a;
			} else if (0 > a || a > 100) {
				avg = Math.round(sum / (double)num * 10) / 10.0;
				break;
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
