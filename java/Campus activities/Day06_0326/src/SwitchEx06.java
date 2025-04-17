import java.util.Scanner;

public class SwitchEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월부터 12월 사이의 월을 입력하세요. >> ");
		int month = Integer.parseInt(sc.nextLine());
		
		if(month >= 1 && month <= 12) {
			switch(month) {
				case 3:
				case 4:
				case 5: System.out.println("개나리가 만발한 봄입니다."); break;
				case 6:
				case 7:
				case 8: System.out.println("더운 여름입니다."); break;
				case 9:
				case 10:
				case 11: System.out.println("천고마비의 가을입니다."); break;
				case 12:
				case 1:
				case 2: System.out.println("붕어빵의 계절 겨울입니다.");
			}
		} else {
			System.out.println("1월부터 12월 사이의 월만 입력하세요.");
		}
		sc.close();
		
	}

}
