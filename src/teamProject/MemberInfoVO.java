package teamProject;

public class MemberInfoVO {
	
	private int userNo;
	private String userID;
	private String userPW;
	private String nickName;
	private String userName;
	private boolean gender;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "회원번호 : " + userNo + ", ID(PW) : " + userID + "(" + userPW + "), nickname : " + nickName
				+ ", 이름 :" + userName ;
	}
	
	
	
	
	
}
