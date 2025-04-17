/*
 * java.util 패키지에 있는 내장 추상클래스인 Calendar는 컴퓨터 시스템의 년월일 시분초 값을 반환한다.
 */

import java.util.Calendar;

public class InterEx11 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	// +1을 하는 이유 : 1월이 0으로 반환되기 때문
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초입니다.");
	}

}
