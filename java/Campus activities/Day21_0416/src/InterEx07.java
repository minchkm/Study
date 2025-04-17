/*
 * Object 최고조상 클래스의 내장메서드 중에서 문자열 값 반환해주는 toString() 메서드를 오버라이딩
 * java.lang 은 기본 패키지 경로이다.
 */

class Point07 {
	int x, y;
	
	Point07() {}	// 기본 생성자
	
	// 생성자 오버로딩
	Point07(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		String result;
		result = "(x 좌표값 : " + this.x + ", y 좌표값 : " + this.y + ")";
		
		return result;
	}
	
	
}

public class InterEx07 {

	public static void main(String[] args) {

		Point07 pt = new Point07(100, 200);
		System.out.println(pt);		// .toString()이 생략됨
		
	}

}
