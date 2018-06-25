package ch05;

public class csh13 {
	public static void main(String[] args) {
		int[][] numbers = {
				{5, 8, 10, 6, 4},
				{11, 20, 1, 13, 2},
				{7, 9, 14, 22, 3},
		};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%2d   ", numbers[i][j]);
			}
			System.out.println();
		}
	}

}
