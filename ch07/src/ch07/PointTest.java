package ch07;

class PointTest {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		String result = p.getLocation();
		System.out.println(result);
	}
}

class Point2 {
	int x, y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);	// 부모의 기본생성자 호출 (명시적으로 작동하지 않으면 자동으로 컴파일러가 추가)
		this.z = z;
	}
	
	String getLocation() {	// 오버라이딩
		return "x :" + x + ", y:" + y + ", z:" + z;
	}
}
