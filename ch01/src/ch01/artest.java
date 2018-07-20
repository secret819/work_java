package ch01;

public class artest {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			double d = Math.random() * 10;
			a[i] = (int)d;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
