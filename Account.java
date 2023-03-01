/**
 * 
 */
package com.PersonDetail;
/**
 * @author HP
 *
 */

enum Type{
	ADMINISTRATOR,
	EMPLOYEE,
	STUDENT;
}
enum AccountStatus{
	ACTIVE,
	CLOSED,
	CANCELLED,
	BLOCKED;
}
public class Account {
	private String userName;
	private String password;
	private Type userType;
	private AccountStatus accountStatus;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the userType
	 */
	public Type getUserType() {
		return userType;
	}
	/**
	 * @return the accountStatus
	 */
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(Type userType) {
		this.userType = userType;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	public void getAllUserType() {
		System.out.println("1."+ Type.ADMINISTRATOR);
		System.out.println("2."+ Type.EMPLOYEE);
		System.out.println("3."+ Type.STUDENT);
	}
	public void getAllUserStatus() {
		System.out.println("1."+ AccountStatus.ACTIVE);
		System.out.println("2."+ AccountStatus.BLOCKED);
		System.out.println("3."+ AccountStatus.CANCELLED);
		System.out.println("4."+ AccountStatus.CLOSED);
	}
	public void displayUserAccounts(Account a) {
		System.out.println("User name : "+ a.getUserName());
		System.out.println("Password : "+ a.getPassword());
		System.out.println("User Type : "+ a.getUserType());
		System.out.println("User Status : " + a.getAccountStatus());
	}
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", accountStatus=" + accountStatus + "]";
	}
	
}
