/*
 * static import문
 * 		static import문을 사용하면 static 멤버(정적변수, 정적메소드)를 호출할 때 클래스 이름 생략 가능
 * 		그만큼 코드가 간결해짐
 */

import static java.lang.System.out;
import static java.lang.Math.*;
// java.lang은 기본 패키지 경로이다. 코드상에서 생략하더라도 기본값으로 제공한다.

public class SuperEx03 {

	public static void main(String[] args) {

		out.println("난수 = " + random());
		out.println("원주율 = " + PI);
		
	}

}
