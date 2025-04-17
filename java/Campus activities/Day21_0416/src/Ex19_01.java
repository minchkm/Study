import net.daum.model01.IShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class Ex19_01 {

	static void Shape01(IShapeClass ish) {	
		ish.draw();
	}

	public static void main(String[] args) {
		
		Shape01(new Circ());
		Shape01(new Rect());
		Shape01(new Tria());
		
		System.out.println("\n========================\n");

		IShapeClass ref;
		
		ref = new Circ();
		ref.draw();
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
	}

}