/**
 * 
 */
package com.PersonDetail;

import java.time.LocalDate;
import java.util.Date;

import com.others.Address;

/**
 * @author HP
 *
 */
enum Gender{MALE,FEMALE,TRANSGENDER;}
public class Person {
	private String personName;
	private String personMobile;
	private LocalDate personDob;
	private long personAge;
	private Gender personGender;
	private Address personAddress;
	private Account personAccount;
	private String personEmailID;
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @return the personMobile
	 */
	public String getPersonMobile() {
		return personMobile;
	}
	/**
	 * @return the personAge
	 */
	public long getPersonAge() {
		return personAge;
	}
	/**
	 * @return the personGender
	 */
	public Gender getPersonGender() {
		return personGender;
	}
	/**
	 * @return the personAddress
	 */
	public Address getPersonAddress() {
		return personAddress;
	}
	/**
	 * @return the personAccount
	 */
	public Account getPersonAccount() {
		return personAccount;
	}
	/**
	 * @return the personEmailID
	 */
	public String getPersonEmailID() {
		return personEmailID;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @param personMobile the personMobile to set
	 */
	public void setPersonMobile(String personMobile) {
		this.personMobile = personMobile;
	}
	/**
	 * @param personAge the personAge to set
	 */
	public void setPersonAge(long personAge) {
		this.personAge = personAge;
	}
	/**
	 * @param personGender the personGender to set
	 */
	public void setPersonGender(Gender personGender) {
		this.personGender = personGender;
	}
	/**
	 * @param personAddress the personAddress to set
	 */
	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}
	/**
	 * @param personAccount the personAccount to set
	 */
	public void setPersonAccount(Account personAccount) {
		this.personAccount = personAccount;
	}
	/**
	 * @param personEmailID the personEmailID to set
	 */
	public void setPersonEmailID(String personEmailID) {
		this.personEmailID = personEmailID;
	}
	
	/**
	 * @return the personDob
	 */
	public LocalDate getPersonDob() {
		return personDob;
	}
	/**
	 * @param date the personDob to set
	 */
	public void setPersonDob(LocalDate date) {
		this.personDob = date;
	}
	public void displayPersonDetails() {
		System.out.println("Name : "+ personName);
		System.out.println("Age : "+ personAge);
		System.out.println("DoB : "+ personDob);
		System.out.println("Mobile Number : "+ personMobile);
		System.out.println("Gender : "+ personGender);
		System.out.println("Address : "+ personAddress);
		System.out.println("Account Details : "+ personAccount);
		System.out.println("Email Id : "+ personEmailID);
	}
	public void displayGender() {
		Gender gender[] = Gender.values();
		int i= 1;
		for(Gender gen : gender) {
		System.out.println(i++ + "."+ gen);
		}
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personMobile=" + personMobile + ", personDob=" + personDob
				+ ", personAge=" + personAge + ", personGender=" + personGender + ", personAddress=" + personAddress
				+ ", personAccount=" + personAccount + ", personEmailID=" + personEmailID + "]";
	}
	
	
}
