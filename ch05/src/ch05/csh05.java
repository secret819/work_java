package ch05;

import java.util.Scanner;

public class csh05 {
	public static void main(String[] args) {
		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		Scanner scanner = new Scanner(System.in);
		String[] num = scanner.nextLine().split(" ");
		
		double num01 = score[Integer.parseInt(num[0]) - 1];
		double num02 = score[Integer.parseInt(num[1]) - 1];
		
		double sum = num01 + num02;
		System.out.println(sum);
	}

}
