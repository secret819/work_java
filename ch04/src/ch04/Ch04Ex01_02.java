package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String strHeight = scanner.nextLine();
		String strWeight = scanner.nextLine();
		int height = Integer.parseInt(strHeight);
		int weight = Integer.parseInt(strWeight);		
		
		int obesity = weight + 100 - height;
		
		System.out.println(+obesity);
		
		if (obesity > 0) {
			System.out.println("Obesity");
		}
		
	}

}
