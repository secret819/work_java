package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);

		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}

}


/*//1. 년도(정수) 입력받기
		Scanner scanner = new Scanner(System.in);
		int year = Integer.parseInt(scanner.nextLine());
		
		// 2. 윤년인지 조건문으로 검사
		boolean case01 = year % 400 == 0;
		boolean case02 = year % 4 == 0 && year % 100 != 0;
		
		if ( case01 || case02 ) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}*/