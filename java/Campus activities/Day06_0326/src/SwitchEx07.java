// if else 다중 조건문을 사용한 사계절 구하기 예제

import java.util.Scanner;

public class SwitchEx07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월부터 12월 사이의 월만 입력 >> ");
		int month = Integer.parseInt(sc.nextLine());
		
		if (!(month >= 1 && month <= 12)) {
			System.out.println("1월부터 12월 사이의 월만 입력하세요.");
		} else {
			if (month == 3 || month == 4 || month == 5) {
				System.out.println("봄입니다.");
			} else if (month == 6 || month == 7 || month == 8) {
				System.out.println("여름입니다.");
			} else if (month == 9 || month == 10 || month == 11) {
				System.out.println("가을입니다.");
			} else {
				System.out.println("겨울입니다.");
			}
		}
		
		sc.close();
		
	}

}
