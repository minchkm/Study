/*
 * 메소드 오버로딩이란?
 * 		동일한 클래스 내에서 동일한 이름의 메소드를 여러 번 중복해서 정의하는 것
 * 
 * 오버로딩된 메소드 구분 요건
 * 		1. 전달 인자(매개변수) 타입을 다르게 한다.
 * 		2. 매개변수 개수를 다르게 한다.
 */

class Mt09 {
	// 매개변수 타입이 다른 오버로딩
	int abs(int data) {
		if(data < 0) {
			data = -data;
		}
		return data;
	}
	
	double abs(double data) {
		if(data < 0) {
			data = -data;
		}
		return data;
	}
	
	// 매개변수 개수가 다른 오버로딩
	void p(int a) {
		System.out.println(a);
	}
	
	void p(int a, int b) {
		System.out.println(a + "\t" + b);
	}
}

public class ObjectEx09 {

	public static void main(String[] args) {
		
		Mt09 mt = new Mt09();
		int result = mt.abs(-100);
		System.out.println("-100의 절대값 = " + result);
		System.out.println("-10.9의 절대값 = " + mt.abs(-10.9));
		mt.p(10);
		mt.p(10, 20);
	}

}
