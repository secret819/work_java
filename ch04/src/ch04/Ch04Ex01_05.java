package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		 * String[] numbers = scanner.nextLine().split(" ");
		 * double num1 = Double.parseDouble(numbers[0]);
		 * double num2 = Double.parseDouble(nembers[1]);
		 */
		
		String tmp = scanner.nextLine();
		String tmp2 = scanner.nextLine();
		double input = Double.parseDouble(tmp);
		double input2 = Double.parseDouble(tmp2);
		
		if (input >= 4.0 && input2 >= 4.0) {
			System.out.println("A");
		} else if (input >= 3.0 && input2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		
	}

}


/*//1. 두 개의 실수 입력받기
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		double num1 = Double.parseDouble(numbers[0]);
		double num2 = Double.parseDouble(numbers[1]);
		
		// 2. 모두 4.0 이상이면 "A" 출력
		if (num1 >= 4.0 && num2 >= 4.0) {
			System.out.println("A");
		}
		// 3. 모두 3.0 이상이면 "B" 출력
		else if (num1 >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		}
		// 4. 아니면 "C" 출력
		else {
			System.out.println("C");
		}*/