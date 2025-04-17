// java 12 버전에서 switch-case 다중 선택문에 표현식 문법인 '->' 화살표 연산자가 추가됨
// java 13 버전에서 yield 키워드가 추가되어 반환값 지정 가능해짐

public class SwitchEx10 {

	public static void main(String[] args) {
		
		int day = 2;
		
		// 1. switch-case문에 표현식 문법인 화살표 연산자 '->'를 사용하면 코드가 더 간결해짐
		// 2. 이를 통해 값을 반환해서 변수를 초기화할 수 있음
		
		String dayName = switch(day) {
			case 1 -> "월요일";
			case 2 -> "화요일";
			case 3 -> "수요일";
			case 4 -> "목요일";
			case 5 -> "금요일";
			case 6 -> "토요일";
			case 7 -> "일요일";
			default -> "알 수 없는 요일";
		};
		
		System.out.println("반환된 요일 : " + dayName);
		
		System.out.println("\n=====================\n");
		
		var day02 = 1;
		
		// 1. java 10 버전에서 도입된 var 키워드는 생성자나 메소드 내에 선언되는 지역변수 타입을 추론할 수 있게 해줌
		// 2. java 13 버전에서 도입된 yield 키워드는 switch-case 블록 내에서 반환값을 명시적으로 지정할 수 있게 해줌
		//    이 경우 반드시 default문이 있어야 함
		
		String dayName2 = switch(day02) {
			case 1 -> {
				String name = "월요일";
				yield name;		// yield 키워드로 값 반환
			}
			case 2 -> {
				String name = "화요일";
				yield name;
			}
			case 3 -> {
				String name = "수요일";
				yield name;
			}
			default -> {
				String name = "알 수 없는 요일";
				yield name;
			}
		};
		
		System.out.println("반환된 요일 : " + dayName2);
		
		System.out.println("\n=====================\n");
		
	}

}
