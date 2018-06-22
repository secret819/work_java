package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		if (n > 20) {
			return;
		}

		int[] people = new int[n];

		String[] score = scanner.nextLine().split(" ");

		for (int i = 0; i < people.length; i++) {			
			people[i] = Integer.parseInt(score[i]);
		}

		for (int i = people.length - 1; i > 0; i--) {
			boolean changed = false;
			int count = 0;

			for (int j = people.length - 1 - count; j > 0 ; j--) {
				if(people[j] > people[j - 1]) {
					int temp = people[j];
					people[j] = people[j - 1];
					people[j - 1] = temp;
					changed = true;
				}
			}
			count++;

			if (!changed) {
				break;
			}


		}
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}

	}

}
