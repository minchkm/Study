// if 조건문에 관한 예제

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} 
		if(num != 0){
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		sc.close();
		
	}

}
