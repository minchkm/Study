// if-else 다중 조건문에 관한 예제

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		
		int score = 0;		// 점수
		char grade = ' ';	// 학점
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0부터 100 사이의 수학 점수 입력 >> ");
		score = Integer.parseInt(sc.nextLine());
		
		if(!(score >= 0 && score <= 100)) {		// 점수가 0 ~ 100이 아닌 경우
			System.out.println("0부터 100 사이의 수학 점수만 입력하세요.");
		} else {
			if(score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		
		System.out.println("취득하신 수학 점수 " + score + "점은 " + grade + "학점입니다.");
		
		sc.close();
		
	}

}
