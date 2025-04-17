/*
 * static 키워드로 정의된 변수를 정적 변수라고 한다.
 * 정적 변수는 클래스 변수로서 해당 클래스로 직접 접근이 가능하다.
 */

class Product {
	static int count = 0;
	int serialNo;		// 인스턴스 변수 (생성된 객체마다 주소값이 다름)
	
	// 인스턴스 초기화 블록 
	{
		++count;	// 개수를 카운터 (생성된 객체마다 값을 공유 가능함 -> 누적 카운터)
		serialNo = count;
	}
	
	public Product() {}	// 기본생성자 (생성자 오버로딩이 안 되었기 때문에 생략 가능)
}

public class StaticEx01 {

	public static void main(String[] args) {

		Product p01 = new Product();
		Product p02 = new Product();
		Product p03 = new Product();
		
		System.out.println("p01 제품번호(시리얼 번호) : " + p01.serialNo);
		System.out.println("p02 제품번호(시리얼 번호) : " + p02.serialNo);
		System.out.println("p03 제품번호(시리얼 번호) : " + p03.serialNo);
		System.out.println("총 생산대수 : " + Product.count);	// 클래스명.정적변수
		
	}

}
