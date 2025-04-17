class Products {
	String name;
	int price;
	
	Products() {}
	
	Products(String name) {
		this(name, 800);
	}
	
	Products(int price) {
		this("물", price);
	}
	
	Products(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void print() {
		System.out.println(name + ", " + price);
	}
}
public class Ex13_02 {

	public static void main(String[] args) {
		Products p1 = new Products("웰치스", 700);
		Products p2 = new Products("커피");
		Products p3 = new Products(500);
		Products p4 = new Products();
		
		p1.print();
		p2.print();
		p3.print();
		
	}
}
