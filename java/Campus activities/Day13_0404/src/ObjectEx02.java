/*
 * Animal02 클래스를 설계할 때 클래스 소속 변수인 속성(멤버 변수)을 private으로 정의한 경우의 처리 방법
 */

class Animal02 {
	String name;
	private int age;	// age 속성이 private으로 정의되어 있어 Animal02 클래스 외부에서 접근 불가능
	
	// set + 속성명(멤버변수명)
	// 값을 저장하는 메소드로, 통칭해서 setter() 메소드라고 함
	public void setAge(int new_age) {	
		age = new_age;
	}
	
	// get + 속성명(멤버변수명)
	// 값을 반환하는 메소드로, 통칭해서 getter() 메소드라고 함
	public int getAge() {				
		return age;
	}
}

public class ObjectEx02 {

	public static void main(String[] args) {
		
		Animal02 a = new Animal02();
		
		a.name = "홍길동";
		a.setAge(25);
		
		System.out.println("이름 : " + a.name + ", 나이 : " + a.getAge());

	}

}
