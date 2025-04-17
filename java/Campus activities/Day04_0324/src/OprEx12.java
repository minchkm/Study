// 소수점 이하 넷째 자리에서 반올림하지 않고 버림하는 경우
public class OprEx12 {

	public static void main(String[] args) {
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		// float * int 는 자동산술법에 의해서 float * float가 됨
		// 3.141592f * 1000f = 3141.592f
		// 이를 (int)로 명시적인 형변환하여 소수점 이하를 반올림하지 않고 버림 -> 3141
		// 자동산술법에 의해 3141f / 1000f = 3.141f
		
		System.out.println(shortPi);
		
		

	}

}
