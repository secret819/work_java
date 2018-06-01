package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

		// 정수 3개를 문자열로 입력받기(nextLine() 세번 호출)
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		// 입력받은 문자열 3개를 정수(int)형으로 변경
	    int a = Integer.parseInt(input);
		int b = Integer.parseInt(input2);
		int c = Integer.parseInt(input3);
		
		double d = (double)(a + b + c);			// 3과목 점수 합한값을 실수형으로 변경
		double e = d / 3;						// 3과목의 평균을 구하는 공식
		double f = Math.round(e * 10) / 10.0;	// 소수점 2번째 자리에서 반올림
		
		System.out.printf("%.1f", f);			// 소수점 1번째 자리 까지 출력
	}

}
