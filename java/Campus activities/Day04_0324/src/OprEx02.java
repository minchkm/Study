/*
 * 증감연산자 종류
 * ++i (선행 증가), i++ (후행 증가)
 * --i (선행 감소), i-- (후행 감소)
 * i++ 은 i+=1, i=i+1 과 같다.
 */
public class OprEx02 {

	public static void main(String[] args) {

		int a = 10, b = 10;
		++a;	// 선행 증가
		System.out.printf("a = %d %n", a);
		
		a--;	// 후행 감소
		System.out.printf("a = %d %n", a);
		
		System.out.println(b++);	// 후행 증가
		System.out.printf("b = %d%n", b);
		
		b = 10;
		int result = ++b;	// 선행 증가
		System.out.printf("result = %d\n", result);
		
	}

}
