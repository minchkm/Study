/* 멀티 쓰레드 스케줄링 메서드중에서 wait(),nodify()메서드에 관한 실습
 * 
 */
import java.util.ArrayList;

class Table{
	 String[] dishNames = { "dounut","dounut","buger"}; //음식재료



final int MAX_FOOD = 6;
	 private ArrayList<String> dishes = new ArrayList<>();
     
	 //동기화 된 음식 추가 
	 public synchronized void add(String dish) {
		 while(dishes.size() >=MAX_FOOD) {
			 String name = Thread.currentThread().getName(); //현재 실행중인 스레드 이름을 반환
			System.out.println(name+"is waiting");
			
			try {
				wait(); //요리사 스레드 기다리게 함
			}catch(InterruptedException id) {
				
			}
			dishes.add(dish); //음식추가
			notify(); //기다리고 있는 손님스레드를 깨워서 음식을 식사하게 한다
			System.out.println("Dishes : "+dishes.toString()); //추가한 음식목록을 스트링으로 출력
			 }
		     
		
	 }
	 public void remove(String dishName) {
		  synchronized (this) {
			  String name = Thread.currentThread().getName(); 
			  
			while(dishes.size() ==0) {
				System.out.println(name+" is waiting");
				
				try {
					wait();
					Thread.sleep(500);
					
				}catch(InterruptedException ie) {}
				
			}
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i); //음식을 제거
						notify(); //요리사 쓰레드 깨우기
						return; //종료
					}
				}
				try {
					System.out.println(name+"is wating");
					wait();
					Thread.sleep(500);
				}catch(InterruptedException ie) {}
			}
			
		}
	 }
	 public int dishNum() {
		  return dishNames.length;
	 }

}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.food =food;
		this.table =table;}

	@Override
	public void run() {
		while(true) {
			try {
				 Thread.sleep(100);
			}catch(InterruptedException ie) {}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name+"ate a"+food);
		}
	}
}
class Cook implements Runnable{
  private Table table;
  
  public Cook(Table table) {
	  this.table =table;
  }
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]); //테이블에 음식추가
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException ie) {}
		}
	}
	
}

public class TwoEx02 {
	public static void main(String[] args) throws Exception{
       Table table = new Table();
       
       new Thread(new Cook(table),"COOK01").start(); //요리사 스레드 시작
       new Thread(new Customer(table,"dounut"),"CUST01").start();
       new Thread(new Customer(table,"buger"),"CUST02").start();
       Thread.sleep(2000);
       System.exit(0);
	}

}
