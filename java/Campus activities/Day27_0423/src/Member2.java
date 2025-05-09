
public class Member2 {
 
	private String name;
	private Integer id;
	
	public Member2() {
		System.out.println("Member2실행");
	}
	public Member2(Integer id) {
		System.out.println("Member2(Tnteger");
		this.id = id;
	}
	public Member2(String name, Integer id) {
		System.out.println("Member2(Tsssdnteger");
		this.id = id;
		this.name =name;
	}
}
