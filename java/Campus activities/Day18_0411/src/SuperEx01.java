/*
 * 부모클래스와 동일한 멤버변수가 자손에서 정의된 경우 부모로부터 상속받은 멤버변수명에 접근할 때는 super.변수명으로 접근
 * 자손에서 정의된 동일 멤버변수명에 접근할 때는 this.변수명 또는 그냥 변수명으로 접근
 */

class Father01 {
	int a = 10;
}

class Son01 extends Father01 {
	int a = 20;
	
	void pr() {
		System.out.println("a = " + a);
		System.out.println("this.a = " + this.a);
		System.out.println("super.a = " + super.a);
	}
}
public class SuperEx01 {

	public static void main(String[] args) {
		
		Son01 s01 = new Son01();
		s01.pr();

	}

}
