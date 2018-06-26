package ch06;

class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	String name;
	// 2. 나이
	int age;
	// 3. 주소
	String address;
	
	// 행동(메서드)
	// 1. 자기소개
	void self_introduction() { System.out.printf("저는 %d살 %s에 사는 %s입니다.", age, address, name); }
	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
}
