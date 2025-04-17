// if-else 조건문 예제

import java.util.Scanner;	// import : 외부 패키지의 api 활용

public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 숫자 입력 >> ");
		String temp = sc.nextLine();
		int num = Integer.parseInt(temp);
		
		if(num == 0) {
			System.out.println("입력하신 숫자 " + num + "은(는) 0입니다.");
		} else {
			System.out.println("입력하신 숫자 " + num + "은(는) 0이 아닙니다.");
		}
		
		sc.close();

	}

}
