package Users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UsersEntity {

	private String userName;
	private String password;
	private String enable;
	
	@Id
	@GeneratedValue
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	
	@Override
	public String toString() {
		return "UsersEntity [userName=" + userName + ", password=" + password + ", enable=" + enable + "]";
	}
	
	
	public UsersEntity(String userName, String password, String enable) {
		super();
		this.userName = userName;
		this.password = password;
		this.enable = enable;
	}
	
	
}
