package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

		// 실수 2개를 문자열로 입력받기(nextLine() 두번 호출)
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		// 입력받은 문자열 2개를 실수(double)형으로 변경
	    double a = Double.parseDouble(input);
		double b = Double.parseDouble(input2);
		
		// 실수형 곱셈
		double c = a * b;
		
		System.out.printf("%d ",(int)c);	// c에 저장된 실수형 곱셈 값을 정수로 변환
		System.out.printf("%d", (int)a * (int)b);	// 실수값을 식안에서 명시적 형변환으로 정수형 곱셈
		
		
	}

}
