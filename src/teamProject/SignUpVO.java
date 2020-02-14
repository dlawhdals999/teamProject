package signUp;

public class SignUpVO {

	private int idx;
	private String userID;
	private String userPW;
	private String userPWCheck;
	private String userName;
	private String nickname;
	private Boolean gender;

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserPWCheck() {
		return userPWCheck;
	}
	public void setUserPWCheck(String userPWCheck) {
		this.userPWCheck = userPWCheck;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "SignUpVO [idx=" + idx + ", userID=" + userID + ", userPW=" + userPW + ", userPWCheck=" + userPWCheck
				+ ", userName=" + userName + ", nickname=" + nickname + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	
	
}
