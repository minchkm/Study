/*
 * 클래스와 객체 지향에 관한 소스
 */

class Animal01 {
	// 클래스 소속의 속성 name, age 정의
	// 클래스 소속의 멤버 변수 중 객체를 생성해서 접근하는 인스턴스 변수
	String name;
	int age;
}

class Thing {
	int x;
}

public class ObjectEx01 {

	public static void main(String[] args) {
		
		Animal01 a = new Animal01();	// new 키워드로 객체를 생성하여 객체 주소가 저장된 참조변수 a가 됨
		
		a.name = "홍길동";
		a.age = 26;
		
		System.out.println("이름 : " + a.name + ", 나이 : " + a.age);
		
		
		Animal01 b = new Animal01();
			
		b.name = "펭귄";
		b.age = 12;
		
		System.out.println("이름 : " + b.name + ", 나이 : " + b.age);
		
		
		Thing thing = new Thing();
		
		thing.x = 10;
		
		System.out.println("x의 값 = " + thing.x);

	}

}
