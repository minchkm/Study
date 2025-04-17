// 증감 연산자

public class OprEx05 {

	public static void main(String[] args) {

		int i = 5, j = 0;
		
		j = i++;	// i의 변수값 5를 j에 저장한 후 1 증가
		System.out.printf("i = %d, j = %d \n", i, j);
		
		i = 5;
		j = 0;
		
		j = ++i;	// 먼저 1 증가 후 i의 변수값 6을 j에 저장
		System.out.println("i = " + i + ", j = " + j);
		
		i = 5;
		j = 5;
		System.out.printf("i++ = %d%n", i++);
		System.out.printf("i = %d%n", i);
		
		System.out.printf("++j = %d%n", ++j);
		
	}

}
