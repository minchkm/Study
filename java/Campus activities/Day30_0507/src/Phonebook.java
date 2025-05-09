import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();  // 연락처 저장 리스트
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("\n#### 전화번호 부 메뉴 ####");
            System.out.println("1. 연락처 추가");
            System.out.println("2. 연락처 보기");
            System.out.println("3. 연락처 수정");
            System.out.println("4. 연락처 삭제");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int menuNum;
            try {
                menuNum = Integer.parseInt(scan.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            if(menuNum == 5) {
                System.out.println("시스템이 종료되었습니다.");
                break;
            } else if(menuNum < 1 || menuNum > 5) {
                System.out.println("메뉴의 번호만 눌러주세요.");
                continue;
            }

            switch(menuNum) {
                case 1: // 연락처 추가
                    System.out.print("이름: ");
                    String name = scan.nextLine();
                    System.out.print("전화번호: ");
                    String phone = scan.nextLine();
                    System.out.print("이메일: ");
                    String email = scan.nextLine();

                    Contact newContact = new Contact(name, phone, email);
                    contacts.add(newContact);

                    System.out.println("연락처가 추가되었습니다.");
                    break;

                case 2: // 연락처 보기
                    if(contacts.isEmpty()) {
                        System.out.println("등록된 연락처가 없습니다.");
                    } else {
                        System.out.println("등록된 연락처 목록:");
                        for(int i = 0; i < contacts.size(); i++) {
                            System.out.println((i+1) + ". " + contacts.get(i));
                        }
                    }
                    break;

                case 4: // 연락처 삭제
                    if(contacts.isEmpty()) {
                        System.out.println("등록된 연락처가 없습니다.");
                        break;
                    }
                    System.out.println("삭제할 연락처 번호를 입력하세요:");
                    for(int i = 0; i < contacts.size(); i++) {
                        System.out.println((i+1) + ". " + contacts.get(i));
                    }
                    System.out.print("번호 선택: ");
                    int delIndex;
                    try {
                        delIndex = Integer.parseInt(scan.nextLine()) - 1;
                    } catch(NumberFormatException e) {
                        System.out.println("숫자만 입력해주세요.");
                        break;
                    }
                    if(delIndex < 0 || delIndex >= contacts.size()) {
                        System.out.println("잘못된 번호입니다.");
                        break;
                    }

                    contacts.remove(delIndex);
                    System.out.println("연락처가 삭제되었습니다.");
                    break;

                default:
                    System.out.println("알 수 없는 오류가 발생했습니다.");
                    break;
            }
        }

        scan.close();
    }
}
