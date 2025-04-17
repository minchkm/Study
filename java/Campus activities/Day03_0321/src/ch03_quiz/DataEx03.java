package ch03_quiz;

public class DataEx03 {

	public static void main(String[] args) {

		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		
		var4 = var1;	// 암묵적인 자동형변환 (byte -> long)
		System.out.println("var1 = " + var1 + ", var4 = " + var4);
		var1 = (byte)var3;	// 캐스팅 연산자 (byte)를 사용해서 명시적인 형변환
							// byte 최대값 범위를 벗어나서 최소값이 저장됨
		System.out.println("var1 = " + var1 + ", var4 = " + var3);
		
		float var5 = 123456.789123f;
		double var6 = 123456.789123;
		
		var5 = (float)var6;
		System.out.println("var5 = " + var5 + ", var6 = " + var6);

	}

}
