package Main;

public class User {
	private int uid;
	private String uname;
	private String umail;
	
	public User(int uid, String uname, String umail) {
		this.uid = uid;
		this.uname = uname;
		this.umail = umail;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	
}
