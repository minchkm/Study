import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FromIntRangeEx {
	static int sum;
    public static void main(String[] args) {
       
    	IntStream stream = IntStream.rangeClosed(1, 100);
    	
    	stream.forEach(k -> sum +=k);
    	System.out.println(sum);
    	
    	sum =0;
    	List<Integer> numList = new ArrayList<>();
    	for(int k =0; k<10; k++) {
    		 
    		int randNum = (int)(Math.random() * k) + 1;
    	            numList.add(randNum);
    	            System.out.print(" "+numList.get(k));
    		     
    	}
    	
    	
    	System.out.println();
    	
    	int total = 0;
        for (int n : numList) {
            total += n;
    	}
        System.out.println("numList의 누적합: " + total);
    }
}