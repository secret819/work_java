package ch03;

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
		
		
		double c = (double)a / b;	// 첫 번째 수를 실수로 변환하여 두 번째 수로 나눔
		double d = Math.round(c * 100) / 100.0;	// 소수점 3째자리 에서 반올림
		
		System.out.printf("%d ", a / b);	// 첫 번째 수를 두 번째 수로 나눈 몫을 출력
		System.out.printf("%.2f", d);	// 소수 둘째 자리까지 출력
	}

}
