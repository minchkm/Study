/*
 * 매개변수 타입이 기본 타입이면 값이 전달되고, 객체 주소는 공유하지 않는다.
 * 값에 의한 호출 방식 (Call By Value)
 */

class Vm04 {
	void changeNumber(int y) {
		y = 10;
	}
}

public class BasicRef04 {

	public static void main(String[] args) {
		
		Vm04 vm = new Vm04();
		int x = 7;
		System.out.println("메소드 호출 전 x = " + x);
		vm.changeNumber(x);
		System.out.println("메소드 호출 후 x = " + x);

	}

}
