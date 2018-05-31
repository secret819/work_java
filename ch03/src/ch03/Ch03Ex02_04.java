package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String input = scanner.nextLine();
	String input2 = scanner.nextLine();
	String input3 = scanner.nextLine();
	String input4 = scanner.nextLine();

	int a = Integer.parseInt(input);
	int b = Integer.parseInt(input2);
	int c = Integer.parseInt(input3);
	int d = Integer.parseInt(input4);
	
	System.out.printf("%b%n", a > c && b > d);
	}

}
