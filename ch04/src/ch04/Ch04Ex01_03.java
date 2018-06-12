package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String strAge = scanner.nextLine();
		int age = Integer.parseInt(strAge);
		
		if (age >= 20) {
			System.out.println("adult");
		} else if (age < 20) {
			int laterAge = 20 - age;
			System.out.println(laterAge + " years later");
		}
	}

}

/*//1. 정수 1개 입력받기
		Scanner scanner = new Scanner(System.in);
		int years = Integer.parseInt(scanner.nextLine());
		
		// 2. 20살 이상이면 "adult" 출력
		if (years >= 20) {
			System.out.println("adult");
		}
		// 3. 그렇지 않으면 몇년뒤 성인이 되는지 출력
		else {
			int later = 20 - years;
			System.out.println(later + " years later");
		}*/