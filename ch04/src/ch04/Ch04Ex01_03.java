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
