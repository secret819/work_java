package ch05;

import java.util.Scanner;

public class ch05Ex01_01 {
	public static void main(String[] args) {
		String[] str = new String[10];
		
		for (int i = 0; i < str.length; i++) {
			Scanner scanner = new Scanner(System.in);
			String[] tmp = scanner.nextLine().split(" ");
			int num = Integer.parseInt(tmp[i]);
			//str[i] = num;
		}
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		
		
	}
}
