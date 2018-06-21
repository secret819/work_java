package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] weight = scanner.nextLine().split(" ");
		double sum = 0;
		int count = 0;
		
		for (int i = 0; i < weight.length; i++) {
		
		sum += Double.parseDouble(weight[i]);
		count++;
		}
		
		System.out.printf("%.1f", sum / count);
	}

}
