package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String strGender = scanner.nextLine();
		String strAge = scanner.nextLine();
		
		int age = Integer.parseInt(strAge);
		
		if (age >= 18) {
			if (strGender == "M") {
				System.out.println("MAN");
			} else if (strGender == "F") {
				System.out.println("WOMAN");
			}
		} if (age < 18) {
			if (strGender == "M") {
				System.out.println("BOY");
			} else if (strGender == "F"){
				System.out.println("GIRL");
			}
		}
	}

}
