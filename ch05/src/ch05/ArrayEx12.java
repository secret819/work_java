package ch05;

public class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"kim", "Park", "Yi"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]: "  + names[i]);
		}
		String tmp = names[2];	// 배열 names의 세번째 요소를 tmp에 저장
		System.out.println("tmp:" + tmp);
		
		names[0] = "Yu";	// 베열 names의 첫번째 요소를 "Yu"로 변경
		
		for (String str : names) {	// 향상된 for문
			System.out.println(str);
		}
	}

}
