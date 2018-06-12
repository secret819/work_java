package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		
		if (a == 1) {
			System.out.println("dog");
		} else if (a == 2) {
			System.out.println("cat");
		} else if (a == 3) {
			System.out.println("chick");
		} else {
			System.out.println("I don`t know.");
		}
	}

}

/*//1. "번호를 입력하세요. > " 문구 출력
		System.out.print("번호를 입력하세요. > ");
		
		// 2. 정수 입력받기
		Scanner scanner = new Scanner(System.in);
		int menu = Integer.parseInt(scanner.nextLine());
		
		// 3. switch문 이용하여 번호에 해당하는 동물 출력하기
		switch (menu) {
		case 1:
			System.out.println("dog");
			break;
			
		case 2:
			System.out.println("cat");
			break;
			
		case 3:
			System.out.println("chick");
			break;
			
		default:
			System.out.println("I don't know.");
		}*/
