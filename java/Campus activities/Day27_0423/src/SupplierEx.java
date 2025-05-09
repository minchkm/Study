/* java.util.function 피키지의 Supplier 계열의 내장함수형 인터페이스 특징
 * 1.매개값은 없고 리턴값은 있다
 * 
 */

import java.util.function.IntSupplier;

public class SupplierEx {
	public static void main(String[] args) {
        
		IntSupplier intSupplier = () -> {
			
			
			
			 return (int)(Math.random() * 6) + 1;
		};
	    
		int resultNumber = intSupplier.getAsInt();
		System.out.println("임의의 주사위 눈의 수 "+resultNumber);
		
		
	}

}
