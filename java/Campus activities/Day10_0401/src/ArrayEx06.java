// 다양한 배열 생성법, 배열원소값 읽어오는 법

import java.util.Arrays;

public class ArrayEx06 {

	public static void main(String[] args) {

		int[] iArr01 = new int[10];		// 배열 크기가 10인 iArr01 배열 생성
		int[] iArr02 = new int[] {100, 95, 80, 70, 100};
		int[] iArr03 = {100, 100, 85, 95, 90};
		char[] chArr = {'a', 'b', 'c', 'd'};	// 단일문자 타입 배열 chArr 생성
		
		int i;
		for(i = 0; i < iArr01.length; i++) {
			iArr01[i] = i + 1;
			System.out.print(" " + iArr01[i]);
		}
		System.out.println("\n=======================\n");
		
		// 자바 5에서 추가된 향상된 확장 for문
		for(int a : iArr02) {
			System.out.print(" " + a);
		}
		System.out.println("\n=======================\n");
		
		// 내장 api를 사용해 배열원소값을 문자열로 반환
		System.out.println(Arrays.toString(iArr03));
		System.out.println("\n=======================\n");
		
		System.out.println(chArr);
	}
}
