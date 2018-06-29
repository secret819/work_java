package ch06;

class PersonTest {
	public static void main(String[] args) {
		/*
		// 1. 사람 3명(객체 3개) 만들기
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		p1.name = "홍길동";
		p2.name = "김철수";
		p3.name = "이영희";
		
		p1.age = 26;
		p2.age = 25;
		p3.age = 24;
		
		p1.address = "신림동";
		p2.address = "봉천동";
		p3.address = "신림동";
		
		
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		p1.self_introduction();
		System.out.println();
		
		p2.self_introduction();
		System.out.println();
		
		p3.self_introduction();
		*/
		
		// 1. 사람 3명(객체 3개) 만들기
		Person[] p = new Person[3];
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
				// (자기 자신 포함해서 옆사람 정보 작성하기)
		/*for (int i = 0; i < p.length; i++) {
			p[i] = new Person();			
		}*/
		
		// [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		p[0] = new Person("철수", 40, "서울");
		p[1] = new Person("영희", 38, "부산");
		p[2] = new Person("길동", 19, "대전");
		
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
				// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for (int i = 0; i < p.length; i++) {
			p[i].introduce();
			System.out.println();
		}
		
		// [2-4] 2-3에서 작성한 생성자를 이용하여 "흥민"이라는 이름으로 사람 객체 하나를 생성하세요.
		Person p1 = new Person("흥민");
		
		// [2-5] 2-4 객체를 이용하여 introduce() 메서드를 호출하세요.
		p1.introduce();
	}	
}
