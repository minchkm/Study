package net.daum.dto;

public class MemberDTO {
	
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	private String mem_addr;
	private String mem_phone;
	
	// 기본 생성자 생략
	
	public String getMem_id() {		// 값반환 메소드(getter 메소드)
		return mem_id;
	}
	public void setMem_id(String mem_id) {	// 값저장 메소드(setter 메소드)
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_addr() {
		return mem_addr;
	}
	public void setMem_addr(String mem_addr) {
		this.mem_addr = mem_addr;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	
	

}
