// 열거 타입을 사용한 예제

import java.util.Calendar;

public class ObjectArrEx08 {

	public static void main(String[] args) {

		Week today = null;	// Week 열거 타입도 참조 타입이어서 today라는 참조 변수 선언 가능
		
		Calendar cal = Calendar.getInstance();
		// java.util 패키지에 있는 내장 추상 클래스인 Calendar는 년, 월, 일, 시, 분, 초 등을 반환
		
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 일요일 : 1, ... , 토요일 : 7까지 정수 반환
		
		System.out.println("반환된 week 값 : " + week);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;	// 열거 타입 변수에 열거 타입 상수 대입 가능
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일은 " + today);
		
		if(today == Week.SUNDAY) {	// 열거 타입 변수 today가 특정 열거 상수와 같은지 비교할 때는 "==" 사용
			System.out.println("이룡일에는 축구를 합니다.");
		} else {
			System.out.println("자바 열공합니다.");
		}
	}

}
