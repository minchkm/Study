// 메소드 리턴 타입이 참조형인 경우

class Data13 {
	int x;
}

public class BasicRef13 {

	public static void main(String[] args) {
		
		Data13 d = new Data13();
		d.x = 10;
		
		Data13 d2 = copy(d);	// d와 d2는 서로 다른 객체 주소를 가짐 (d2 = tmp)
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	
	static Data13 copy(Data13 d) {	// 메소드 반환타입이 Data13 클래스형 참조타입
		Data13 tmp = new Data13();	// 새로운 객체 tmp를 생성하여 새로운 주소 할당
		tmp.x = d.x;	// new 메소드로 tmp 객체를 생성했기 때문에 tmp와 d는 서로 다른 객체 주소를 가짐
						// 그러므로 값만 복사됨
		return tmp;
	}

}
