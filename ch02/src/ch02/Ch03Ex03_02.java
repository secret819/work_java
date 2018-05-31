package ch02;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

		// 정수 2개를 문자열로 입력받기(nextLine() 두번 호출)
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		// 입력받은 문자열 2개를 정수(int)형으로 변경
	    int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		
		System.out.printf("%d ", a / b);
		System.out.printf("%.2f", (double)a / b + 0.5);
	}

}
