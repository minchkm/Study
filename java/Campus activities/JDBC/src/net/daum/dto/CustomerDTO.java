package net.daum.dto;

/**
 * 고객 정보를 저장하는 DTO 클래스
 */
public class CustomerDTO {

    // 고객번호
    private int cus_no;
    // 고객이름
    private String cus_name;
    // 고객 전화번호
    private String cus_phone;
    // 고객 이메일
    private String cus_email;
    // 고객 등록일자
    private String cus_date;

    // 고객번호 getter
    public int getCus_no() {
        return cus_no;
    }
    // 고객번호 setter
    public void setCus_no(int cus_no) {
        this.cus_no = cus_no;
    }
    // 고객이름 getter
    public String getCus_name() {
        return cus_name;
    }
    // 고객이름 setter
    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }
    // 고객전화번호 getter
    public String getCus_phone() {
        return cus_phone;
    }
    // 고객전화번호 setter
    public void setCus_phone(String cus_phone) {
        this.cus_phone = cus_phone;
    }
    // 고객이메일 getter
    public String getCus_email() {
        return cus_email;
    }
    // 고객이메일 setter
    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }
    // 고객등록일자 getter
    public String getCus_date() {
        return cus_date;
    }
    // 고객등록일자 setter
    public void setCus_date(String cus_date) {
        this.cus_date = cus_date;
    }
}
