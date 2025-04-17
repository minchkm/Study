import java.util.Scanner;

public class Ex04_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int num = scan.nextInt();
		
		String s = "";
		
		s = num%2==0 ? "짝수" : "홀수";
		
		System.out.printf("%d은 %s이다.", num, s);
		
		scan.close();
	}
}
