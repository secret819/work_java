package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		for (int i = alphabets.length; i >= 0; i--) {
			//String ch = alphabets[]
			System.out.printf("%s ", alphabets);
		}
	}

}
