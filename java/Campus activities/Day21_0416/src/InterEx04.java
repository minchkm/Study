
public class InterEx04 {

	public static void main(String[] args) {
		
		ImpClass impl = new ImpClass();
		
		InterfaceA ia = impl;	// 업캐스팅
		ia.methodA();		// 업캐스팅 이후 오버라이딩한 메서드 호출
		
		System.out.println("\n=====================\n");
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println("\n=====================\n");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
