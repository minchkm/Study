/*
 * 오버로딩된 메소드 구분요건 기준은 매개변수이다. 
 * 리턴타입을 다르게 한 메소드 오버로딩은 허용하지 않는다.
 */

class Mt11 {
	void pr(int a) {
		System.out.println(a);
	}
	
	// 메소드명 앞의 리턴 타입을 다르게 한 메소드 오버로딩은 허용하지 않음
	int pr(int a) {
		return a;
	}
}
public class ObjectEx11 {

	public static void main(String[] args) {
		
		Mt11 mt11 = new Mt11();
		mt11.pr(100);
		int k = mt11.pr(1000);
		System.out.println(k);

	}

}
