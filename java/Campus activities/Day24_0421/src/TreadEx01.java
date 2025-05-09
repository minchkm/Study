/* 멀티 스레드 구현법 
 *  Tread 클래스를 상속하는법
 *  run() 메서드를 오버라이딩을 해서 스레드 문장을 구현
 *  Tread클래스를 상속받아서 스레드 프로그램을 만들면 단순한 것을 만들수 있고,단점으로는 단일상속만 가능하다는 점이다
 */

class Tread01 extends Thread{
	Tread01(String name){
		super(name); //부모클래스 오버로딩된 생성자를 호출해서 스레드 이름을 반환
	}

	@Override
	public void run() {
		for(int num=1; num<=5; num++) {
			for(int k=1; k<1000000; k++);
			System.out.println(num);
		}
	}
	
	
	
	
	
	
}
public class TreadEx01 {
	public static void main(String[] args) {
  Tread01 th01 = new Tread01("첫번쟤");
  Tread01 th02 = new Tread01("두번쟤");
  th01.start();
  th02.start();
	}

}
