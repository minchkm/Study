/*
 * 2차원 배열을 사용하여 영문자에 대한 한글 답안 찾는 예제
 */

import java.util.Scanner;

public class ObjectArrEx07 {

	public static void main(String[] args) {

		String[][] words = {
				{"java", "자바"},
				{"int", "정수"},
				{"for", "반복문"} 
		};

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			
			String answer = sc.nextLine();
			
			if(answer.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n", words[i][1]);
			}
		}
		
		sc.close();
	}

}
