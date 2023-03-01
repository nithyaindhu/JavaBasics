/**
 * 
 */
package com.PersonDetail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author HP
 *
 */
class InvalidNameException extends Exception{
	InvalidNameException(String str){
		super(str);
	}
}
class InvalidPasswordException extends Exception{
	InvalidPasswordException(String str){
		super(str);
	}
}
class DateException extends Exception{
	DateException(String str){
		super(str);
	}
}
class InvalidMobileNumberException extends Exception{
	InvalidMobileNumberException(String str){
		super(str);
	}
}
class InvalidGenderException extends Exception{
	InvalidGenderException(String str){
		super(str);
	}
}
class InvalidEmailIdException extends Exception{
	InvalidEmailIdException(String str){
		super(str);
	}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(String str){
		super(str);
	}
}
public class Validation {
		public boolean isUserNameValid(String userName) throws InvalidNameException{
			if(userName.length()>2) {
				return true;
			}
			throw new InvalidNameException("Invalid Name!!!\nName must contain atleast 3 characters");
		}
		
		public boolean isUserPassWordValid(String userPassWord) throws InvalidPasswordException {
			int upCharCount = 0,lowCharCount =0, numCount = 0, specialCount = 0;
			for(int i = 0; i<userPassWord.length();i++) {
				if(userPassWord.charAt(i)>='A'&&userPassWord.charAt(i)<='Z') {
					upCharCount++;
				}
				else if(userPassWord.charAt(i)>='a'&& userPassWord.charAt(i)<='z') {
					lowCharCount++;
				}
				else if(userPassWord.charAt(i)>='0' && userPassWord.charAt(i)<='9') {
					numCount++;
				}
				else if(userPassWord.charAt(i)>32){
					specialCount++;
				}
			}
			if(upCharCount>=1 && lowCharCount>=1 && numCount>=1 && specialCount>=1 && userPassWord.length()>=8) {
				return true;
			}
			throw new InvalidPasswordException("Password is not Strong!!!");		
		}	
		
		public boolean  isDobValid(String dob, String format) throws  DateException {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
			
			try {
			LocalDate date = LocalDate.parse(dob, dtf);
			return true;
			}catch(Exception e) {
				System.out.println("Enter date in the given format!!!");
				throw new DateException("Enter date in the given format!!!");		
			}		
		}
		public boolean isMobileNumberValid(String mobileNumber) throws InvalidMobileNumberException{
			if(mobileNumber.length()==10) {
				int flag = 0;
				for(int i =0;i<10;i++) {
					if(mobileNumber.charAt(i)<'0' || mobileNumber.charAt(i)>'9') {
						flag = 1;
						break;
					}
				}
				if(flag ==0) {
					return true;
				}
				else {
					throw new InvalidMobileNumberException("Invalid Mobile Number!!!\nNumber must contain 10 digits");
				}
			}
			else {
				throw new InvalidMobileNumberException("Invalid Mobile Number!!!\nNumber must contain 10 digits");
			}
			
		}
		
		public boolean isGenderValid(String gender) throws InvalidGenderException{
			
			if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")||gender.equalsIgnoreCase("transgender")) {
				return true;
			}
			throw new InvalidGenderException("Enter valid Gender!!!");
		}
		
		public boolean isEmailIdValid(String email) throws InvalidEmailIdException{
			if(email.length()>10) {
				if(email.substring(email.length()-10, email.length()).equals("@gmail.com")) {
					return true;
				}
			}
			throw new InvalidEmailIdException("Enter valid EmailId!!!");
		}
		public boolean isAgeValid(int age) throws InvalidAgeException{
			if(age>0 && age<=100) {
				return true;
			}
			throw new InvalidAgeException("Enter valid age!!!");
		}
}
