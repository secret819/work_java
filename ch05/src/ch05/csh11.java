package ch05;

import java.util.Scanner;

public class csh11 {
	public static void main(String[] args) {
		int[] counter = new int[10];

		while (true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());

			if (num == 0) {
				break;
			}

			int ten = num / 10;
			counter[ten]++;			
		}

		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.println(i + " : " + counter[i]);
			}
		}
	}

}
