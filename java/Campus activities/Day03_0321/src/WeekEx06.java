/*
 * 자바의 논리연산자
 * 1. 논리연산자 결과값도 true 또는 false 이다.
 * 2. 논리연산자 종류
 * 		&& (논리곱, AND) : 조건이 모두 true일 때만 결과값 true, 나머지는 false
 * 		|| (논리합, OR) : 조건 중 하나라도 true일 경우 결과값 true, 조건이 전부 false일 때만 결과값 false
 * 		!  (논리부정, NOT) : 조건이 true이면 결과값 false, 조건이 false이면 결과값 true
 */

import java.util.Scanner;

public class WeekEx06 {

	public static void main(String[] args) {
		
		boolean re = false;
		re = (true && true);
		System.out.printf("%b && %b : %b \n", true, true, re);
		
		re = (false || false);
		System.out.println("false || false : " + re);
		
		re = !false;
		System.out.printf("!%b : %b \n", false, re);
		
		Scanner scan = new Scanner(System.in);
		String result = "";
		
		System.out.print("나이 입력 >> ");
		String inputAge = scan.nextLine();	// 사용자 입력값을 문자열로 받아들임
		int age = Integer.parseInt(inputAge);	// 문자열 숫자를 정수로 변환
		
		result = (20 <= age && age <= 29)?"20대":"20대가 아니다";	// 삼항 조건 연산자
		System.out.println(age + "세는 " + result);

	}

}
