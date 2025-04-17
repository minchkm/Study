/*
 * 삼항 조건연산자
 * 조건식 ? 조건식이 참이면 실행 : 조건식이 거짓이면 실행
 */

import java.util.Scanner;

public class WeekEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Ctrl + Shift + O : 임포트 단축키
		// Scanner 내장 클래스 : 사용자 입력을 받기 위해 사용
		// System.in : 키보드 입력장치와 연결
		// new : 새로운 객체명 scan 생성
		
		System.out.print("첫 번째 정수값 입력 >> ");
		String num1 = scan.nextLine();	// 문자열로 입력받음
		int a = Integer.parseInt(num1);	// parseInt() 정적메소드로 입력받은 문자열 숫자를 정수로 변경
		
		System.out.print("두 번째 정수값 입력 >> ");
		String num2 = scan.nextLine();
		int b = Integer.parseInt(num2);
		
		int max = (a > b) ? a : b;	// 삼항 조건 연산자 ( 참이면 a 출력, 거짓이면 b 출력 )
		System.out.println("max = " + max);
	}

}
