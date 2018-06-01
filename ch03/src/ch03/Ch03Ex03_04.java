package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

		// 실수 3개를 문자열로 입력받기(nextLine() 세번 호출)
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input3 = scanner.nextLine();

		// 입력받은 문자열 3개를 실수(double)형으로 변경
	    double a = Double.parseDouble(input);
	    double b = Double.parseDouble(input2);
	    double c = Double.parseDouble(input3);
	    
	    int sum = (int)a + (int)b + (int)c;	// 정수부분의 합
	    double avg = (a + b + c) / 3;		// 실수값의 평균
	    
	    System.out.printf("sum %d%n", sum);		// 세 값의 정수 부분의 합 출력
	    System.out.printf("avg %d%n", (int)avg);	// 세 값의 실수 평균의 정수부분만 출력
	    
	}

}
