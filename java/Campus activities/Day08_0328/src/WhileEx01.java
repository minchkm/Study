// while 조건식을 true로 설정하면 무한루프

import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int number = 0;
		int sum = 0;
		boolean flag = true;	// while 조건식에 설정할 boolean 타입 변수
		
		System.out.println("누적합을 구할 숫자를 입력하세요. 반복문을 끝내려면 0을 입력하세요.");
		
		while (flag) {
			System.out.print(">>");
			
			Scanner sc = new Scanner(System.in);
			
			String inputNumber = sc.nextLine();		// 문자열로 읽어들임
			number = Integer.parseInt(inputNumber);	// 읽어들인 문자열 숫자를 정수 숫자로 변환
			
			// 입력값이 0이 아닐 경우
			if (number != 0) {
				sum += number;
			} else {	// 입력값이 0일 경우 flag 값을 false로 바꿔서 무한루프문 종료
				flag = false;
			}
			sc.close();
		} // while end
		System.out.println("누적합계 = " + sum);
		
		
	}
}
