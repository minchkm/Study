class Mt {
	public void p(int a, int b) {
		if(a > b) {
			System.out.println("정수 최대값 = " + a);
		} else {
			System.out.println("정수 최대값 = " + b);
		}
	}
	
	public void p(double a, double b) {
		if(a > b) {
			System.out.println("실수 최대값 = " + a);
		} else {
			System.out.println("실수 최대값 = " + b);
		}
	}
}
public class Ex12_01 {

	public static void main(String[] args) {
		
		Mt mt = new Mt();
		
		mt.p(10, 20);
		mt.p(10.0, 20.0);		
	}	
}
