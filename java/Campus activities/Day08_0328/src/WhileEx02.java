// Math.random() 함수로 1~100 사이 임의의 난수를 발생시키고, 
// 사용자로부터 1~100 사이의 정수를 입력받아 맞추는 예제
// do-while문 사용

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		int inputNumber = 0;
		int min = 1;
		int max = 100;
		
		int answer = (int)(Math.random() * 100) + 1;
		// random() 메소드는 0.0 이상 1.0 미만의 실수 난수를 발생시킴
		// 100을 곱하여 0.0 이상 100.0 미만의 실수 난수를 발생시킴
		// (int)로 캐스팅하여 소수점 이하를 버림
		// +1을 하여 1 이상 101 미만, 즉 1~100 사이의 임의의 정수 난수가 발생
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print(min + "부터 " + max + " 사이 임의의 정수 숫자를 입력 >> ");
			inputNumber = Integer.parseInt(sc.nextLine());
			
			if(inputNumber > answer) {
				System.out.println("정답 숫자는 " + inputNumber + "보다 작습니다.\n");
				max = inputNumber;
			} else if (inputNumber < answer){
				System.out.println("정답 숫자는 " + inputNumber + "보다 큽니다.\n");
				min = inputNumber;
			}
		} while (inputNumber != answer);
		
		System.out.println("정답 숫자는 " + inputNumber + "입니다.");
		
		sc.close();

	}

}
