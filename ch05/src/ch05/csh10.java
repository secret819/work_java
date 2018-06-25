package ch05;

import java.util.Scanner;

public class csh10 {
	public static void main(String[] args) {
		int[] counter = new int[26];
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			char ch = scanner.nextLine().charAt(0);
			
			if ('A' <= ch && ch <= 'Z') {
				counter[ch - 'A']++;
			}
			else {
				break;
			}
		}
		
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				System.out.printf("%c : %d%n", i + 'A', counter[i]);
			}
		}
		
	}

}
