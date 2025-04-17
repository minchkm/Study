
public class VarTest04 {

	public static void main(String[] args) {
		
		int year = 2025;
		int age = 25;
		
		System.out.printf("연도 : %d \n", year);
		System.out.printf("나이 : %d \n", age);
		
		year = age + 2000;
		age += 1;
		System.out.println("연도 : " + year + ", 나이 : " + age);
		
		System.out.println("\n ================> \n");
		
		int x = 10;
		int y = 20;
		int tmp = 0;
		
		System.out.println("x = " + x + ", y = " + y);
		
		// x와 y의 변수값을 변경
		tmp = x;	// tmp에 x값 10 대입
		x = y;		// x에 y값 20 대입
		y = tmp;	// y에 tmp값 10 대입
		
		System.out.println("x = " + x + ", y = " + y);
	}

}
