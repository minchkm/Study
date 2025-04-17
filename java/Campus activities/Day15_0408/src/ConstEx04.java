/*
 * 생성자가 오버로딩된 경우
 * 		- 생성자가 오버로딩이 되면 컴파일러는 더 이상 기본 생성자를 제공하지 않는다.
 */

class Board04 {
	private String title;
	private String content;
	
	public Board04(String new_title, String new_content) {
		title = new_title;
		content = new_content;
	}
	
	public void print() {
		System.out.println("게시판 제목 : " + title + ", 게시판 내용 : " + content);
	}
}

public class ConstEx04 {

	public static void main(String[] args) {
		
//		Board04 b = new Board04();	// 기본생성자를 호출하려다 컴파일 에러 발생
//		b.print();
		
		Board04 b2 = new Board04("제목입니다.", "내용입니다.");
		b2.print();

	}

}
