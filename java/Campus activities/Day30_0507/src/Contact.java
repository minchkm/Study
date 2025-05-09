
public class Contact {
	 private String name;
	    private String phone;
	    private String email;

	    // 생성자
	    public Contact(String name, String phone, String email) {
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	    }

	    // getter, setter (필요시)
	    public String getName() {
	        return name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public String getEmail() {
	        return email;
	    }
	    
	 
	    

	    public void setName(String name) {
			this.name = name;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		// toString() 오버라이드해서 보기 좋게 출력
	    @Override
	    public String toString() {
	        return "이름: " + name + ", 전화번호: " + phone + ", 이메일: " + email;
	    }
	}

