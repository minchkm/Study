/*
 * 길이가 10인 배열을 만들고 0~9의 임의의 정수 난수로 배열 원소값을 초기화
 * 배열에 저장된 각 숫자가 몇 번 반복되는지 카운트하여 또 다른 배열 counter에 담아서 출력
 */

public class ObjectArrEx01 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		// 정수 난수로 배열 원소값 초기화
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			
			System.out.print(" " + numArr[i]);
		}
		System.out.println("\n=========================\n");
		
		for(int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 = " + counter[i]);
		}
	}

}
