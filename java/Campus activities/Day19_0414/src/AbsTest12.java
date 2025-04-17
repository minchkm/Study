/*
 * 추상 클래스 특징
 * 		1. 추상 클래스도 일반 클래스와 마찬가지로 일반 속성과 메서드가 올 수 있다.
 * 		2. 추상 클래스에서는 일반 클래스에서 올 수 없는 abstract 키워드로 정의되는 추상 메서드가 올 수 있다.
 * 		   추상 메서드는 { }가 없고, 실행 문장이 없고, 호출이 불가능하다.
 */

class Abs12 {
	abstract void pr();	// 추상 메서드는 일반 클래스에서는 정의할 수 없음
}

abstract class Abs13 {
	int a = 10;			// 추상 클래스에는 일반 속성이 올 수 있음
	
	void print() {} 	// 추상 클래스에는 일반 메서드도 올 수 있음
	
	abstract void pr02();	// 추상 메서드 : 중괄호 없음, 실행문장 없음, 호출 불가능
}

public class AbsTest12 {

	public static void main(String[] args) {

	}

}
