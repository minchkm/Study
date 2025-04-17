class Mp3 {
	private String comp;
	private int size;
	
	public void setComp(String new_comp) {
		comp = new_comp;
	}
	
	public void setSize(int new_size) {
		size = new_size;
	}
	
	public String getComp() {
		return comp;
	}
	
	public int getSize() {
		return size;
	}
}

public class Ex12_02 {

	public static void main(String[] args) {

		Mp3 mp = new Mp3();
		
		mp.setComp("갑을회사");
		mp.setSize(8);
		
		System.out.println("회사명 : " + mp.getComp());
		System.out.println("메모리 용량 : " + mp.getSize() + "G");
	}
}
