class SubClass {
	int i = 3;
}

public class Ex17_01 {

	public static void main(String[] args) {
		
		Object o = new SubClass();
		
		if(o instanceof SubClass) {
			SubClass foo = (SubClass)o;
			System.out.println("i = " + foo.i);
		} else {
			System.out.println("다운캐스팅을 할 수 없습니다.");
		}
	}
}
