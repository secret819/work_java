package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int a = Integer.parseInt(input);
		
		System.out.printf("%d%n", a++);
		System.out.printf("%d%n", ++a);
	}

}
