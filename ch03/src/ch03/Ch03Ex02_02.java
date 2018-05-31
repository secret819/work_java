package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String strwidth = scanner.nextLine();
		String strlength = scanner.nextLine();

		int width = Integer.parseInt(strwidth);
		int length = Integer.parseInt(strlength);
		
		width = width + 5;
		length = length * 2;
		
		System.out.printf("width = %d%nlength = %d%narea = %d", width, length, width * length);
	}

}
