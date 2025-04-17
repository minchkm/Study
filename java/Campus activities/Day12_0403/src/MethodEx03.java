// 절대값 구하는 예제

import java.util.Scanner;

public class MethodEx03 {
	
	static int abs(int data) {
		if(data < 0) {
			data = -data;
		}
		
		return data;
	}
	
	static void abs2(int data) {
		if(!(data < 0)) {
			System.out.println("음의 정수 숫자만 입력하세요.");
		} else {
			if(data < 0) {
				data = -data;
			}
			System.out.println("절대값 = " + data);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음의 정수값 입력 >> ");
		int negativeInt = Integer.parseInt(sc.nextLine());
		
		int result = abs(negativeInt);
		
		System.out.println(negativeInt + "의 반환된 절대값 = " + result);
		
		System.out.print("두 번째 음의 정수값 입력 >> ");
		int number = Integer.parseInt(args[0]);		// 첫 번째 문자열 배열원소값을 가져와서 정수 숫자로 변환
		abs2(number);

	}

}
