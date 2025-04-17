/*
 * 참조변수(레퍼런스)만 선언하고 객체 주소를 대입하지 않은 상태이면 해당 클래스 소속의 멤버변수(속성)에 접근 못함
 */

class Board01 {
	String writer;	// 게시판 글쓴이
	String title;	// 게시판 제목
	String cont;	// 게시판 내용
}

public class BasicRef01 {

	public static void main(String[] args) {
		
		Board01 b;	// 레퍼런스 변수만 선언 (객체 주소가 저장 안 됨)
//		System.out.println("글쓴이 : " + b.writer + ", 제목 : " + b.title + ", 내용 : " + b.cont);
		
		b = new Board01();	// 객체 주소가 대입된 참조변수
		System.out.println("글쓴이 : " + b.writer + ", 제목 : " + b.title
							+ ", 내용 : " + b.cont);

	}

}
