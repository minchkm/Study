import java.util.ArrayList;

public class ListEx13 {

	public static void main(String[] args) {

		ArrayList<String> list =new ArrayList<>();
         list.add("apple");
         list.add("banana");
         list.add("orange");
         
         ArrayList<Object> objlist;
         objlist = list;
         
         for(Object obj :objlist) {
        	 System.out.println(obj);
         }
		
	}

}
