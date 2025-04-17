// 정수 난수를 인덱스 번호로 사용한 예제

import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] score = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * score.length);
			arr[i] = score[tmp];
		}
		
		// 내장 api로 출력
		System.out.println(Arrays.toString(arr));	// 배열 원소값을 문자열로 반환
		
		// for문으로 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("\n====================\n");

		for(int a : arr) {
			System.out.print(" " + a);
		}
	}

}
