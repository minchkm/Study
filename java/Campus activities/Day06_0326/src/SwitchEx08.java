// switch-case문을 사용해서 주민번호 뒷자리 첫 번째 숫자에 따른 성별을 구분하는 예제

import java.util.Scanner;

public class SwitchEx08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("샘플 주민번호 입력(011231-4080212) >> ");
		String juminNo = sc.nextLine();
		char regNo = juminNo.charAt(7);	// 주민번호 뒷자리 첫 번째 숫자를 구함
		
		switch(regNo) {
			case '1':
			case '3': System.out.println("당신은 남자입니다."); break;
			case '2':
			case '4': System.out.println("당신은 여자입니다."); break;
			default: System.out.println("유효하지 않은 주민번호입니다.");
		}
		
		sc.close();
		
	}

}
