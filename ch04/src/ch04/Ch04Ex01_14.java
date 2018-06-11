package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		int lastDay;
		
		Scanner scanner = new Scanner(System.in);
		String strMonth = scanner.nextLine();
		int month = Integer.parseInt(strMonth);
		
		
		switch (month) {
		
		case 2:
			lastDay = 28;
			break;
						
		case 4: case 6: case 9: case 11:
			lastDay = 30;
			break;
							
		default :
			lastDay = 31;
			break;
		
		}
		System.out.println(lastDay);
	}

}
