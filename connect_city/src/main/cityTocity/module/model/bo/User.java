package cityTocity.module.model.bo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name="USER")
public class User {

	@Id
	private long id;
	private String userId;
	private String emaailId;
	private String password;
	private long mobileNumber;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmaailId() {
		return emaailId;
	}
	public void setEmaailId(String emaailId) {
		this.emaailId = emaailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	
}
