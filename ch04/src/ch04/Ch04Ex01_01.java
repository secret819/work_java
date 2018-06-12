package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		int input;

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);

		if (input < 0) {
			System.out.println(+input);
			System.out.println("minus");
		} else {
			System.out.println(+input);
		}
	}
}

/*//1. 정수 입력 받기
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		// 2. 양수이면 입력받은 숫자만 출력
		if (num > 0) {
			System.out.println(num);
		}
		
		// 3. 음수이면 입력받은 숫자와 "minus" 문자열 출력
		if (num < 0) {
			System.out.println(num);
			System.out.println("minus");
		}*/
