package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		String weightDivision;
		
		Scanner scanner = new Scanner(System.in);
		String strWeight = scanner.nextLine();
		double weight = Double.parseDouble(strWeight);
		
		if (weight <= 50.80) {
			weightDivision = "Flyweight";
		} else if (weight <= 61.23) {
			weightDivision = "Lightweight";
		} else if (weight <= 72.57) {
			weightDivision = "Middleweight";
		} else if (weight <= 88.45) {
			weightDivision = "CruiserweightX";
		} else {
			weightDivision = "Heavyweight";
		}
		System.out.println(weightDivision);
	}

}
