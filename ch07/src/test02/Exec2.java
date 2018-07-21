package test02;

public class Exec2 {
	//Dog 클래스를 생성해서
	//Action interface 구현하여
	//printObject로 정보를 찍어보시기 바래요~
	public static void printObject(Action p) {
		p.run();
		p.walk();
		p.sleep();
	}
	
	public static void main(String[] args) {
		Person person = new Person("홍길동", 33);
		printObject(person);
		Cat c = new Cat("동동이", 22);
		printObject(c);
		Dog d = new Dog("댕댕이", 3);
		printObject(d);
		/*Action a = new Person("홍길동", 33);
		a.run();
		a.walk();
		a.sleep();
		
		a = new Cat("동동이", 5);
		a.run();
		a.walk();
		a.sleep();*/
	}

}
