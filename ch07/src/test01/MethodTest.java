package test01;

public class MethodTest {
	String str = "abc";
	
	String test() {
		return "abc";
	}
	
	String test(int a) {
		return "abc";
	}
	
	String test(double d) {
		return "abc";
	}
	// 데이터타입은 String
	// 함수명은 test()
	// 3개의 동일한 함수명으로 선언과
	// 호출해주시면 됩니다.
	
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1.str==mt2.str);
		
		System.out.println(mt1.test());
		System.out.println(mt1.test(1));
		System.out.println(mt1.test(1.1));
	}
}
