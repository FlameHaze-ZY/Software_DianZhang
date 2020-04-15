package 店长功能;

public class manager {
	private String userName;
	private String code;
	public manager(String userName, String code) {
		super();
		this.userName = userName;
		this.code = code;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public int login (String userName, String code) {	//登录函数，正确返回1错误返回0
			if (userName.equals(this.userName)&&code.equals(this.code)){
					return 1;
				}else {
//					System.out.println("wrong code");
					return 0;
				}
	}
}