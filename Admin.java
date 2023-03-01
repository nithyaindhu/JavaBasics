/**
 * 
 */
package com.PersonDetail;
import java.util.ArrayList;

import com.PersonDetail.*;
/**
 * @author HP
 *
 */
public class Admin extends Person{
	private String adminID;
	private String adminGrade;
	private ArrayList<Person> person = new ArrayList<Person>();
	private ArrayList<Account> account = new ArrayList<Account>();
	private ArrayList<Employee> employee = new ArrayList<Employee>();
	private ArrayList<Student> student = new ArrayList<Student>();
	private Employee emp = new Employee();
	private int userCount = 0;
	/**
	 * @return the adminID
	 */
	public String getAdminID() {
		return adminID;
	}
	/**
	 * @return the adminGrade
	 */
	public String getAdminGrade() {
		return adminGrade;
	}
	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	/**
	 * @param adminGrade the adminGrade to set
	 */
	public void setAdminGrade(String adminGrade) {
		this.adminGrade = adminGrade;
	}
	public void displayAdminDetails() {
		//displayPersonDetails();
		System.out.println("Admin Id : "+ adminID);
		System.out.println("Admin Grade : "+ adminGrade);
	}
	
	public void addAccount(String userName, String password,Type userType, AccountStatus accountStatus) {
		Account account = new Account();
		account.setUserName(userName); 
		account.setPassword(password);
		account.setUserType(userType);
		account.setAccountStatus(accountStatus);
		this.account.add(account);
	}
	public void addAccount(Account a) {
//		Account account = new Account();
//		account.setUserName(a.getUserName()); 
//		account.setPassword(a.getPassword());
//		account.setUserType(a.getUserType());
//		account.setAccountStatus(a.getAccountStatus());
		//this.account.add(account);
		this.account.add(a);
	}
	public void addEmployee(Employee e) {
		emp = e;
		this.employee.add(e);
	}
	public void getEmploye(Admin a) {
		System.out.println("Employee id : " + a.emp.getemployeeID());
		System.out.println("Employee designation : "+ a.emp.getemployeeDesignation());
	}
	public boolean isCorrectUserName(String userName, int check) {
		for(Account acc : account) {
			if((acc.getUserName()).equals(userName)) {
				if(check ==1) {
					if(acc.getUserType().equals(Type.ADMINISTRATOR)) {
						return true;
					}
				}
				else if(check == 0) {
					if(acc.getUserType().equals(Type.EMPLOYEE)) {
						return true;
					}
				}
				else {
					if(acc.getUserType().equals(Type.STUDENT)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public boolean isCorrectPassword(String userPassword) {
		for(Account acc : account) {
			if((acc.getPassword()).equals(userPassword)) {
				return true;
			}
		}
		return false;
	}
	public void setPersonDetails(Person person) {
		this.person.add(person);
	}
	public void displayAccounts() {
		for(Account acc : account) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Account user Name : "+ acc.getUserName());
			System.out.println("Account user Password : "+ acc.getPassword());
			System.out.println("Account user Type : "+ acc.getUserType());
			System.out.println("Account user Status : "+ acc.getAccountStatus());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	public void displayPersonDetails(Admin a) {
		for(Person per : person) {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Name : "+ per.getPersonName());
			System.out.println("DoB : "+ per.getPersonDob());
			System.out.println("Age : "+ per.getPersonAge());
			System.out.println("Mobile Number : "+ per.getPersonMobile());
			System.out.println("Gender : "+ per.getPersonGender());
			System.out.println("Address : "+ per.getPersonAddress());
			System.out.println("Account Details : ");
			 per.getPersonAccount().displayUserAccounts(per.getPersonAccount());
			System.out.println("Email Id : "+ per.getPersonEmailID());
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			getEmploye(a);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminGrade=" + adminGrade + "]";
	}
	
}
