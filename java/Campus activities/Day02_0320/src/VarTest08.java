/*
 * 자바의 확장 특수 출력문자 (escape sequence)
 * \n : 줄바꿈, \t : 탭키만큼 수평으로 띄움, \' : 작은 따옴표, \" : 큰따옴표
 * \\ : 역슬래시, \b : 백스페이스, \f : 연속 용지에서 페이지 넘김 (폼피드)
 * \r : 커서를 현재 라인의 맨 앞으로 (carriage return)
 */
public class VarTest08 {

	public static void main(String[] args) {
		
		System.out.println("\'홍길동\'");
		System.out.println("서울시\t부산시\t대전시");
		System.out.println("\n");
		System.out.println("\"대전시\"");
		System.out.println("D:\\");

	}

}
