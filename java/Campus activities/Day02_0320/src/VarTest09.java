/*
 * short, char 기본 타입의 최대값, 최소값 범위를 벗어났을 경우
 */
public class VarTest09 {

	public static void main(String[] args) {
		
		short sMin = -32768;	// short 타입의 최소값 저장
		short sMax = 32767;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (sMin - 1));
		// sMin - 1 은 short 타입으로 뺄셈하는 것이 아닌 int 타입(4바이트)으로 뺄셈을 함
		// 그러면 int 타입의 범위를 벗어나지 않기 때문에 정상적인 뺄셈값 -32769가 출력됨
		System.out.println("sMin - 1 = " + (short)(sMin - 1));
		// short 타입의 최소값 범위를 벗어나서 최대값인 32767 출력됨
		
		System.out.println("\n sMax = " + sMax);
		System.out.println("sMax + 1 = " + (sMax + 1));
		
		System.out.println("sMax + 1 = " + (short)(sMax + 1));
		// short 타입의 최대값 범위를 벗어나서 최소값인 -32768 출력됨
		
		char cMin = 0;
		System.out.println("--cMin = " + (int)--cMin);
		// char 타입의 최소값 범위를 벗어나서 최대값 출력
		
	}

}
