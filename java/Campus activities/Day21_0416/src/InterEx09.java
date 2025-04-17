/*
 * Object 최고 부모클래스의 equals() 메서드를 자손에서 오버라이딩해서 활용
 */

class Point09 extends Object {
	int x, y;
	
	public Point09() {}
	
	public Point09(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		
//		Point09 ptTmp = (Point09)obj;	// 명시적인 다운캐스팅
		
		Point09 ptTmp = new Point09();
		
		if(ptTmp instanceof Object) {
			ptTmp = (Point09)obj;
		}
		
		if ((x == ptTmp.x) && (y == ptTmp.y)) {		// x, y 값만 비교
			return true;
		} else {
			return false;
		}
	}
}

public class InterEx09 {

	public static void main(String[] args) {
		
		Point09 pt01 = new Point09(10, 20);
		Point09 pt02 = new Point09(10, 20);
		
		if(pt01 == pt02) { 		// 참조타입을 '=='로 비교하면 객체주소값을 비교 => false
			System.out.println("두 레퍼런스가 같다.");
		} else {
			System.out.println("두 레퍼런스가 다르다.");
		}
		
		if(pt01.equals(pt02)) {		// 값을 비교 => true
			System.out.println("값이 같다.");
		} else {
			System.out.println("값이 다르다.");
		}
	}
}
