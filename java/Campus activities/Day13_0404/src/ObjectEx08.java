// 자바 OOP에서의 클래스 소속의 사용자 정의메소드
// return 키워드로 값을 반환하는 메소드와 그렇지 않고 구구단을 출력하는 메소드

class Obj07 {
	void print99Dan() {
		int i, j;
		for(j = 1; j <= 9; j++) {
			for(i = 2; i <= 9; i++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println("\n================\n");
	}
	
	int add(int a, int b) {
		return a + b;	// return 키워드에 의해서 메소드를 호출한 곳으로 덧셈 결과값 반환
	}
}
public class ObjectEx08 {

	public static void main(String[] args) {
		
		Obj07 obj = new Obj07();
		obj.print99Dan();
		System.out.println("10 + 10 = " + obj.add(10, 10));
	}

}
