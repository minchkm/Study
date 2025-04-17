// 10장 메소드.pdf No.10 1번 문제, 2번 문제 풀이

import java.util.Scanner;

public class MethodEx04 {

	static void name_func(String name) {
		System.out.println("나의 이름 : " + name);
	}
	
	static void gu(int k) {
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", k, i, k * i);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("본인의 이름 입력 >> ");
		String name = sc.nextLine();
		name_func(name);
		
		System.out.print("출력할 구구단 숫자 입력 >> ");
		int guguDan = Integer.parseInt(sc.nextLine());
		gu(guguDan);
		
	}

}
