package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		if (a > 0) {
			System.out.println("plus");
		} else if (a < 0) {
			System.out.println("minus");
		} else {
			System.out.println("zero");
		}
		
	}
}


/*//1. 정수 하나 입력받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		if (num == 0) {
			System.out.println("zero");
		}
		else if (num > 0) {
			System.out.println("plus");
		}
		else if (num < 0) {
			System.out.println("minus");
		}*/