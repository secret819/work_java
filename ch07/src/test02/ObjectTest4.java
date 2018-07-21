package test02;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	public String toString() {
		return "내이름은 " + this.heroName + "이며 " + this.power + "정도의 힘과 " + this.speed + "정도로 빠르지";
	}
	
	public ObjectTest4(String heroName, int power, int speed) {
		this.heroName = heroName;
		this.power = power;
		this.speed = speed;
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4("홍길동", 1, 1);
		ot4s[1] = new ObjectTest4("임꺽정", 2, 2);
		
		System.out.println(ot4s[0]);
		System.out.println(ot4s[1]);
		
		for(ObjectTest4 i : ot4s) {
			System.out.println(i);
		}
	}
}
