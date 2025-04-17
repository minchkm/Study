/*
 * 생성자가 오버로딩이 안 되었을 때는 컴파일러가 묵시적인 전달인자가 없는 기본 생성자를 제공함
 * 하지만 오버로딩이 된 경우 기본 생성자를 제공하지 않음
 */

class Data08 {
	int value;
	
	public Data08(int value) {
		this.value = value;
	}
	
	void print() {
		System.out.println("value = " + value);
	}
}

public class ConstEx08 {

	public static void main(String[] args) {
		
//		Data08 d = new Data08();	// 기본생성자를 호출하려다가 컴파일 에러 발생
//		d.print();

	}

}
