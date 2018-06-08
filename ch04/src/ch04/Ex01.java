package ch04;

public class Ex01 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		for ( i = 1; sum < 100; i++) {
			if ( i % 2 != 0) {
				sum += i;
			} else {
				sum -= i;
			}
		}
		System.out.println(+i);
	}
}