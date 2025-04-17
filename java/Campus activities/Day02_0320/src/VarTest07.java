/*
 * 자바에서 사용자 입력을 받기 위해서 java.util 패키지의 Scanner 클래스 활용
 * 외부 패키지의 api를 임포트하기 위한 STS 단축키는 < Ctrl + Shift + 영문자 O >
 */

import java.util.Scanner;

public class VarTest07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// System.in : 키보드 입력장치와 연결됨
		// new : 새로운 객체명 scan를 생성하게 함
		 
		System.out.print("나이 입력 >> ");
		
		int age = Integer.parseInt(scan.nextLine());
		// nextLine() : 문자열 한 줄을 읽어들임
		// Integer.parseInt() : 정수로 변경
		
		System.out.printf("나이 : %d %n", age);
		
		scan.close();
		
	}

}
