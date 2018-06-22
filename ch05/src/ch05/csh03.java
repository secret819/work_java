package ch05;

import java.util.Scanner;

public class csh03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		System.out.print(alphabets[0] + " ");
		System.out.print(alphabets[3] + " ");
		System.out.print(alphabets[6]);
	}

}
