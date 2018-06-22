package ch05;

import java.util.Scanner;

public class csh01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		char[] result = new char[alphabets.length];
		
		for (int i = 0; i < alphabets.length; i++) {
			String tmp = alphabets[i];
			
			char tmp2 = tmp.charAt(0);
			
			result[i] = tmp2;
		}
		
		System.out.println(result);
	}

}
