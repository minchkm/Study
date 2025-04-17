// 중첩 if-else문을 사용해서 학점 구하기 예제

import java.util.Scanner;

public class SwitchEx05 {

	public static void main(String[] args) {
		
		int score = 0;		// 점수
		char grade = ' ';	// 학점
		char opt = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0부터 100 사이의 영어 점수 입력 >> ");
		score = Integer.parseInt(sc.nextLine());
		
		if (!(score >= 0 && score <= 100)) {
			System.out.println("0부터 100 사이의 영어 점수만 입력하세요.");
		} else {
			if (score >= 90) {
				grade = 'A';
				if (score >= 95) {
					opt = '+';
				} else if(score >= 90 && score <= 94) {
					opt = ' ';
				}
			} else if (score >= 80) {
				grade = 'B';
				if(score >= 85) {
					opt = '+';
				}
			} else if (score >= 70) {
				grade = 'C';
				if(score >= 75) {
					opt = '+';
				}
			} else if (score >= 60) {
				grade = 'D';
				if(score >= 65) {
					opt = '+';
				}
			} else {
				grade = 'F';
			}
		}
		
		System.out.printf("취득하신 영어 점수 %d점은 %c%c학점입니다.", score, grade, opt);
		sc.close();
		
	}

}
