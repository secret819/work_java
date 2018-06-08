package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
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
