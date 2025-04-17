import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {
		
		String s = "";
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");
		s = sc.nextLine();
		
		System.out.print("반복 횟수 입력 >> ");
		num = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 1; i <= num; i++) {
			System.out.println(s);
		}
		
		sc.close();
	}
}
