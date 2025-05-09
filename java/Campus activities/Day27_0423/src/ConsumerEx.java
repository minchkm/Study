/* java.util.funcion 패키지의 Consumer 내장 함수형인터페이스 특징 
 * 1.매개값은 있고 리턴값이 없다 
 * 
 * 
 */

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {
	public static void main(String[] args) {
		Consumer<String>consumer = t -> System.out.println(t+"21");
		consumer.accept("java");
		
		BiConsumer<String,String> bigConsumer = (t,u) -> System.out.println(t+u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = value -> System.out.println("java"+value);
	      doubleConsumer.accept(2.0);

	      ObjIntConsumer<String> objIntConsumer = (t,e) -> System.out.println(t+e);
	      objIntConsumer.accept("java", 21);
	
	
	}
}
