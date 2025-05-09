class UserExecption extends Exception{
	public UserExecption(String msg) {
		super(msg);
	}
}
public class TryCatch09 {

	public static void main(String[] args) {
try {
	int a =-11;
	if(a<=0) {
		throw new UserExecption("양수가 아님");
	}
}catch(UserExecption e) {
           System.out.println(e.getMessage());	
}
	}

}
