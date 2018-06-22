package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] dice = scanner.nextLine().split(" ");
		int[] counter = new int[6];
				
		for (int i = 0; i < dice.length; i++) {
			int num = Integer.parseInt(dice[i]);
			counter[num - 1]++;			
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i+1 + " : " + counter[i]);
		}
	}

}
