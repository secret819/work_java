package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("정수를 입력하세요.(0:종료)>");
			
			String input = scanner.nextLine();
			int a = Integer.parseInt(input);
			
			if (a == 0) {
				break;
			} else if (a > 0) {
				System.out.println("positive integer");
			} else if (a < 0) {
				System.out.println("negative number");
			}
		}
	}

}
