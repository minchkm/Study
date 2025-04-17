import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.print("홀수 : ");
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n====================\n");
		
		System.out.print("홀수 : ");
		for(int i = 1; i <= num; i+=2) {
			System.out.print(i + " ");
		}	
		
		sc.close();
	}

}
