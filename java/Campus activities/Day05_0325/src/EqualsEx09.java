// if else-if 다중 조건문(선택문)으로 학점 구하기

import java.util.Scanner;

public class EqualsEx09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 100 사이 자바 점수만 입력 >> ");
		int score = Integer.parseInt(sc.nextLine());
		
		char grade = ' ';	// 학점을 저장할 변수
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				grade = 'A';
			} else if(score >= 80) {
				grade = 'B';
			} else if(score >= 70) {
				grade = 'C';
			} else if(score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		} else {
			System.out.println("자바 점수는 0 ~ 100 사이 점수만 입력하세요.");
		}
		System.out.println(score + "은(는) " + grade + "학점입니다.");
		
	}

}
