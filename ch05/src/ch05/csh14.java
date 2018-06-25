package ch05;

import java.util.Scanner;

public class csh14 {
	public static void main(String[] args) {
		int[][] first = new int[2][4];
		int[][] second = new int[2][4];

		System.out.println("first array");

		for (int i = 0; i < first.length; i++) {
			Scanner scanner = new Scanner(System.in);
			String[] num01 = scanner.nextLine().split(" ");

			for (int j = 0; j < num01.length; j++) {
				first[i][j] = Integer.parseInt(num01[j]);
			}
		}
		
		System.out.println("second array");
		
		for (int i = 0; i < second.length; i++) {
			Scanner scanner = new Scanner(System.in);
			String[] num02 = scanner.nextLine().split(" ");
			
			for (int j = 0; j < num02.length; j++) {
				second[i][j] = Integer.parseInt(num02[j]);
			}
		}
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first[i].length; j++) {
				System.out.print(first[i][j] * second[i][j] + " ");
			}
			System.out.println();
		}
	}

}
