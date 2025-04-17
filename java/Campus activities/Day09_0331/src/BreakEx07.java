// while 무한루프문을 활용한 메뉴 선택 예제

import java.util.Scanner;

public class BreakEx07 {

	public static void main(String[] args) {
		
		int menu = 0;	// 선택한 메뉴 번호를 저장

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 - 치킨");
			System.out.println("2 - 오뎅탕");
			System.out.println("3 - 족발");
			System.out.print("원하는 야식메뉴 번호(1~3)를 선택하세요. (종료 : 0) >> ");
			
			String tempMenu = sc.nextLine();
			menu = Integer.parseInt(tempMenu);
			
			if(menu == 0) {
				System.out.println("야식 메뉴 선택 프로그램을 종료합니다.");
				break;
			} else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("메뉴 번호를 잘못 선택했습니다.(종료 : 0)");
				continue;
			}
			
			System.out.println("선택한 메뉴 번호는 " + menu + "번입니다.");
		} // while
		
		sc.close();

	}

}
