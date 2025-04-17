// switch-case문을 사용한 학점 구하기 예제 

import java.util.Scanner;

public class EqualsEx11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0부터 100 사이의 수학 점수를 입력하세요 >> ");
		int score = Integer.parseInt(sc.nextLine());
		
		if(score >= 0 && score <= 100) {
			System.out.print("입력하신 점수 " + score + "점은 ");
			int a = score / 10;
			switch(a) {
			 case 10:
			 case 9: 
				 System.out.print("A학점");
				 break;
			 case 8:
				 System.out.print("B학점");
				 break;
			 case 7:
				 System.out.print("C학점");
				 break;
			 case 6:
				 System.out.print("D학점");
				 break;
			 default:
				 System.out.print("F학점");
			}
			System.out.println("입니다.");
		} else {
			System.out.println("0부터 100 사이의 점수만 입력하세요.");
		}
	}

}
