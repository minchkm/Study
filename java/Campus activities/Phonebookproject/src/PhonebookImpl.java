import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhonebookImpl implements PhoneBookInter{

    private List<Phonebook> list;

    public PhonebookImpl() {
        list = new ArrayList<>();
    }

    @Override
    public int insert(String name, String hp, String email) {
        if(name == null || hp == null || email == null) {
            System.out.println("입력값 중 null값이 있습니다.");
            return 0;
        }

        String regex = "^010-\\d{4}-\\d{4}$";
        if(!hp.matches(regex)) {
            System.out.println("유효한 전화번호가 아닙니다. (예: 010-1234-5678)");
            return 0;
        }

        Phonebook pb = new Phonebook(name, hp, email);
        list.add(pb);
        return 1;
    }

    @Override
    public List<Phonebook> findAll() {
        return list;
    }

    @Override
    public Phonebook findByHp(String hp) {
        for(Phonebook pb : list) {
            if(pb.getHp().equals(hp)) {
                return pb;
            }
        }
        return null;
    }

    @Override
    public int update(String email, String name, String hp) {
        for(Phonebook pb : list) {
            if(pb.getEmail().equals(email)) {
                pb.setName(name);
                pb.setHp(hp);
                return 1;
            }else {
            	System.out.println("제대로 입력해주세요");
            	break;
            }
        }
        return 0;
    }

    @Override
    public int delete(String email) {
        Iterator<Phonebook> iter = list.iterator();
        while(iter.hasNext()) {
            Phonebook pb = iter.next();
            if(pb.getEmail().equals(email)) {
                iter.remove();
                return 1;
            }
        }
        return 0;
    }

    // 메뉴 출력 메서드 (입력은 main에서 처리)
    public void printMenu() {
        System.out.println("==========MENU==========");
        System.out.println("1.전화번호부 입력");
        System.out.println("2.전화번호부 전체출력");
        System.out.println("3.전화번호부 검색");
        System.out.println("4.전화번호부 수정");
        System.out.println("5.전화번호부 삭제");
        System.out.println("6.종료");
        System.out.println("========================");
    }
}
