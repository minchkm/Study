class Things {
	private int x;
	
	public void setX(int new_x) {	
		x = new_x;
	}
	
	public int getX() {	
		return x;
	}


}
public class ThingTest01 {

	public static void main(String[] args) {
		
		Things thing1 = new Things();
		thing1.setX(10);
		
		System.out.println(thing1.getX());

	}
}
