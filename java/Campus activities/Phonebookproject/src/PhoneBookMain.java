import java.util.Scanner;

public class PhoneBookMain {

    public static void main(String[] args) {

        PhonebookImpl pbfunc = new PhonebookImpl();
        Scanner scan = new Scanner(System.in);

        while(true) {
            pbfunc.printMenu();
            System.out.print("메뉴 선택: ");
            int menu = 0;
            try {
                menu = Integer.parseInt(scan.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            switch(menu) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String name = scan.nextLine().trim();
                    System.out.print("전화번호를 입력하세요 (예: 010-1234-5678): ");
                    String hp = scan.nextLine().trim();
                    System.out.print("메일을 입력하세요: ");
                    String email = scan.nextLine().trim();

                    int insertResult = pbfunc.insert(name, hp, email);
                    if(insertResult == 1) {
                        System.out.println("연락처가 추가되었습니다.");
                    } else {
                        System.out.println("연락처 추가에 실패했습니다.");
                    }
                    break;

                case 2:
                    System.out.println("==============================");
                    System.out.println("| 이름\t| 전화번호\t| 이메일\t|");
                    System.out.println("==============================");
                    for(Phonebook pb : pbfunc.findAll()) {
                        System.out.printf("| %s\t| %s\t| %s\t|\n", pb.getName(), pb.getHp(), pb.getEmail());
                    }
                    System.out.println("==============================");
                    break;

                case 3:
                    System.out.print("검색할 전화번호를 입력하세요: ");
                    String searchHp = scan.nextLine().trim();
                    Phonebook found = pbfunc.findByHp(searchHp);
                    if(found != null) {
                        System.out.println("이름: " + found.getName());
                        System.out.println("전화번호: " + found.getHp());
                        System.out.println("이메일: " + found.getEmail());
                    } else {
                        System.out.println("해당 전화번호를 찾을 수 없습니다.");
                    }
                    break;

                case 4:
                    System.out.print("수정할 연락처의 이메일을 입력하세요: ");
                    String emailToUpdate = scan.nextLine().trim();
                    System.out.print("새 이름을 입력하세요: ");
                    String newName = scan.nextLine().trim();
                    System.out.print("새 전화번호를 입력하세요 (예: 010-1234-5678): ");
                    String newHp = scan.nextLine().trim();

                    int updateResult = pbfunc.update(emailToUpdate, newName, newHp);
                    if(updateResult == 1) {
                        System.out.println("수정이 완료되었습니다.");
                    } else {
                        System.out.println("해당 이메일을 찾을 수 없습니다.");
                    }
                    break;

                case 5:
                    System.out.print("삭제할 연락처의 이메일을 입력하세요: ");
                    String emailToDelete = scan.nextLine().trim();
                    int deleteResult = pbfunc.delete(emailToDelete);
                    if(deleteResult == 1) {
                        System.out.println("삭제가 완료되었습니다.");
                    } else {
                        System.out.println("해당 이메일을 찾을 수 없습니다.");
                    }
                    break;

                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("메뉴 번호를 다시 입력해주세요.");
                    break;
            }
        }
    }
}
