/*  컬렉션 설계
 * 
 * 
 */
class GenericClass<T>{
	private T member;
	
	public void setValue(T value) {
		member = value;
	}
	public T getValue() {
		return member;
		
	}
}
public class ListEx12 {

	public static void main(String[] args) {
  
		
		
		GenericClass<Double> obj01 = new GenericClass<>();
		obj01.setValue(7.7);
		System.out.println(obj01.getValue());
		

		GenericClass<Integer> obj02 = new GenericClass<>();
		obj02.setValue(100);
		System.out.println(obj02.getValue());
		

		GenericClass<String> obj03 = new GenericClass<>();
		obj03.setValue("aee");
		System.out.println(obj03.getValue());
		
		
	}

}
