package struts03;

import com.opensymphony.xwork2.Action;

import dao.UserDAO;
import vo.User;

public class Action4 implements Action {

	private String id;
	private String pw;
	private String name;
	private String msg;

	
	public String selectUser() throws Exception{
		UserDAO dao = new UserDAO(); 
 		
 		String userId = "ass11"; //임의로 테스트
 		User user = dao.selectUser(userId); 
 		System.out.println(user);//null 혹은 User의 toString
		
		
		return SUCCESS;  
	}
	
	@Override
	public String execute() throws Exception {

		if (id.equals("") || id.length() < 3) {
			msg = "ID값이 올바르지 않습니다.";
			return INPUT;
		}
		if (pw.equals("") || pw.length() < 3) {
			msg ="PW값이 올바르지 않습니다.";
			return INPUT;
		}
		if (name.equals("") || name.length() < 3) {
			msg = "NAME값이 올바르지 않습니다."; 
			return INPUT;
		}
		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
	
}
