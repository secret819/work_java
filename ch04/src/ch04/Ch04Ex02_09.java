package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			if (a == 0) {
				num++;
				continue;
			} else if (0 <= a && a <= 100) {
				num++;
				sum += a;
			} else if (0 > a || a > 100) {
				avg = Math.round(sum / (double)num * 10) / 10.0;
				break;
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}

/*
//1. 합계와 합한 정수의 개수를 저장하는 변수 선언 및 초기화
		int sum = 0;
		int count = 0;
		
		while (true) {
			// 2. 정수 1개 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			// 4. 특정 조건을 만족하면 while문을 빠져나오도록 한다.
			if (num > 100) {
				break;
			}

			// 3. 합계와 카운트 계산
			sum += num;
			count++;			
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / (double)count));
	}
*/