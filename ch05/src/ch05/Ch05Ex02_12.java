package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		int[] student = new int[100];
		int[] counter = new int[100];
		
		for (int i = 0; i < student.length; i++) {
			
			Scanner scanner = new Scanner(System.in);
			int score = Integer.parseInt(scanner.nextLine());
			
			if (score == 0) {
				break;
			}
			
			int num = (score / 10) * 10;
			
			student[i] = num;
			
			counter[num]++;
		}
		
		for (int i = 0; i < student.length; i++) {
			if (student[i] % 10 == 0 && counter[i] != 0) {
			//System.out.println( + " : " + counter[i * 10] + "person");
			}
		}
	}

}
