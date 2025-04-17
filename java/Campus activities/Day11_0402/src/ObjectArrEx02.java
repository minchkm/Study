// String 문자열 배열 예제

public class ObjectArrEx02 {

	public static void main(String[] args) {

		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
		System.out.println("/n===================\n");
		
		for(String name : names) {
			System.out.print(" " + name);
		}
		System.out.println("\n===================\n");
		
		String tmp = names[2];
		System.out.printf("tmp = %s\n", tmp);
		
		names[0] = "Yang";
		
		for(String editName : names) {
			System.out.println(editName);
		}
		
	}

}
