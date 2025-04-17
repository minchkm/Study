/*
 * Java 5에서 추가된 가변 인자 문법 (Varargs)
 * 		매개변수 개수가 다른 메소드가 오버로딩된 경우 그 개수만큼 메소드를 호출해야 하고, 코드가 길어지게 된다.
 * 		Java 5에서 가변인자 문법이 추가되었다. 형식은 int ... arr 이다. arr은 배열로 처리된다.
 */

class Mt12 {
	void prn(int ... arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
}


public class ObjectEx12 {

	public static void main(String[] args) {
		
		Mt12 mt12 = new Mt12();
		
		mt12.prn(10);
		mt12.prn(10, 20, 30);

	}

}
