// 인스턴스 변수와 정적 변수의 차이점

class St03 {
	static int a = 10;	// static으로 정의된 정적 변수 a
						// 정적 변수는 St03.a 로 해당 클래스로 접근한다
	int b = 20;
	// 클래스 소속 멤버 변수의 종류 : 정적 변수, 인스턴스 변수

}

public class StaticEx03 {

	public static void main(String[] args) {
		
		St03 s01 = new St03();
		St03 s02 = new St03();
		
		System.out.println("s01.a = " + s01.a + "\t s02.a = " + s02.a);
		System.out.println("s01.b = " + s01.b + "\t s02.b = " + s02.b);
		
		s01.a = 100;	// 정적 변수 a값은 생성된 객체에 의해서 공유된다
		System.out.println("s01.a = " + s01.a + "\t s02.a = " + s02.a);
		
		s01.b = 200;
		System.out.println("s01.b = " + s01.b + "\t s02.b = " + s02.b);

	}

}
