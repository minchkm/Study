/*
 * 자바에서 OOP (Object-Oriented Programming, 객체 지향 프로그래밍) 를 사용하는 목적
 * 1. 높은 재사용성
 * 2. 중복 코드 제거
 */

public class ObjectEx07 {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		
		// 기본 for문
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("%d ", numArr[i]);
		}
		
		System.out.println("\n======================\n");
		
		// 향상된 확장 for문
		for(int k : numArr) {
			System.out.print(" " + k);
		}
		
		System.out.println("\n======================\n");
		
		// 객체지향언어 OOP를 활용해서 반복적인 코드 안함
		Arr07 arr = new Arr07();
		arr.printArr(numArr);	// 배열원소값을 출력할 때마다 해당 메소드만 호출하면 됨
		arr.printArr(numArr);
	}

}

class Arr07 {
	void printArr(int[] arr) {
		for(int a : arr) {
			System.out.printf(" %d", a);
		}
		System.out.println("\n===================\n");
	}
}
