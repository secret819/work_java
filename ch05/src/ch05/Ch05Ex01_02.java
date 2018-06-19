package ch05;

public class Ch05Ex01_02 {
	public static void main(String[] args) {
		// [방법 1]
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// [방법 2]
		int[] numbers02 = new int[10];
		for (int i = 0; i < numbers02.length; i++) {
			numbers02[i] = i + 1;
		
		/*
		numbers02[0] = 1;
		numbers02[1] = 2;
		numbers02[2] = 3;
		numbers02[3] = 4;
		numbers02[4] = 5;
		numbers02[5] = 6;
		numbers02[6] = 7;
		numbers02[7] = 8;
		numbers02[8] = 9;
		numbers02[9] = 10;
		*/
		}
		for (int i = 0; i < numbers02.length; i++) {
			System.out.print(numbers02[i] + " ");
		
		/*
		System.out.print(numbers02[0] + " ");
		System.out.print(numbers02[1] + " ");
		System.out.print(numbers02[2] + " ");
		System.out.print(numbers02[3] + " ");
		System.out.print(numbers02[4] + " ");
		System.out.print(numbers02[5] + " ");
		System.out.print(numbers02[6] + " ");
		System.out.print(numbers02[7] + " ");
		System.out.print(numbers02[8] + " ");
		System.out.print(numbers02[9] + " ");
		*/
		}
	}
}
