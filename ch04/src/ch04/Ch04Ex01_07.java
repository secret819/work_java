package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		char C;
		
		Scanner input = new Scanner(System.in);
		C = input.next().charAt(0);
		
		if (C == 'A') {
			System.out.println("Excellent");
		} else if (C == 'B') {
			System.out.println("Good");
		} else if (C == 'C') {
			System.out.println("Usually");
		} else if (C == 'D') {
			System.out.println("Effort");
		} else if (C == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}

}
