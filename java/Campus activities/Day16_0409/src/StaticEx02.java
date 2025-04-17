class Document {
	static int count = 0;	// 정적 변수
	String name;	// 인스턴스 변수 => null로 초기화됨
	
	// 기본 생성자
	Document() {	
		this("제목없음" + ++count);		// 같은 클래스 내의 다른 생성자 호출
	}
	
	// 생성자 오버로딩
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성");
	}
}

public class StaticEx02 {

	public static void main(String[] args) {
		
		new Document();
		new Document("자바.txt");		// 오버로딩된 생성자를 호출
		new Document();
		new Document();

	}

}
