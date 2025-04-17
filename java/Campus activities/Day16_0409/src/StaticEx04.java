// static 키워드로 정의된 정적 메소드는 해당 클래스로 직접 접근이 가능하다.

class St04 {
	private static int a = 10;
	private int b = 20;
	
	public static void setA(int new_a) {
		a = new_a;
	}
	
	public static int getA() {
		return a;
	}
}

public class StaticEx04 {

	public static void main(String[] args) {
		
		System.out.println(St04.getA());	// 클래스명.정적메소드() 로 접근
		
		St04 s01 = new St04();
		St04 s02 = new St04();
		
		s01.setA(1000);
		int res01 = St04.getA();
		System.out.println(res01);
		System.out.println(s02.getA());

	}

}
