
class Product {
	private String name;
	private int price;
	
	public void setName(String new_name) {
		name = new_name;
	}
	
	public void setPrice(int new_price) {
		price = new_price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	void stop() {
		for(int i = 1; i <= 10; i++) {
			if(i == 4) {
				return;		// 종료
			}
			System.out.print("\t" + i);
		}
	}
	
}

public class Ex11_02 {

	public static void main(String[] args) {
		
		Product p = new Product();
		
		System.out.println("자판기 => 제품목록:");

		p.setName("커피");
		p.setPrice(150);
		
		System.out.println(p.getName() + " " + p.getPrice() + "원,");
		
		p.setName("비타500");
		p.setPrice(500);
		
		System.out.println(p.getName() + " " + p.getPrice() + "원");
		
		p.stop();

	}

}
