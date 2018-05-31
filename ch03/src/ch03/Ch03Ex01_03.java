package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		int c = (a++) * (--b);
		
		System.out.printf("%d %d %d", a, b, c);
	}

}
