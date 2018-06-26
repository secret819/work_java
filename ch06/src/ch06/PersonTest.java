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
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();			
		}
		
		p[0].name = "홍길동";
		p[1].name = "김철수";
		p[2].name = "이영희";
		
		p[0].age = 26;
		p[1].age = 25;
		p[2].age = 24;
		
		p[0].address = "신림동";
		p[1].address = "봉천동";
		p[2].address = "신림동";
		
		
		// 3. Person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요.
				// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for (int i = 0; i < p.length; i++) {
			p[i].self_introduction();
			System.out.println();
		}
	}	
}
