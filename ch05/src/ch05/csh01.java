package ch05;

import java.util.Scanner;

public class csh01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] alphabets = scanner.nextLine().split(" ");
		
		char[] ch = new char[alphabets.length];
		
		for (int i = 0; i < alphabets.length; i++) {
			ch[i] = alphabets[i].charAt(0); 
		}
		
		System.out.println(ch);
	}

}
