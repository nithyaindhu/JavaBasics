/**
 * 
 */
package com.PersonDetail;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

import com.others.Address;

/**
 * @author HP
 *
 */
public class Login {
	//private static Admin admin = new Admin();
	//private static Account account =  new Account();
	private static Scanner read = new Scanner(System.in);
	private static String validatingString;
	private static Validation validation = new Validation();
	//private   Person person = new Person();
	//private static Address address = new Address();
	//private Employee employee = new Employee();
	/**
	 * @param args
	 */
	public static Address setAddress() {
		Address address = new Address();
		System.out.print("Enter door no : ");
		address.setDoorNo(read.nextInt());
		System.out.print("Enter Floor no : ");
		address.setFloorNo(read.nextInt());
		read.nextLine();
		System.out.print("Enter street Name : ");
		address.setStreetName(read.nextLine());
		System.out.print("Enter area Name : ");
		address.setAreaName(read.nextLine());
		System.out.print("Enter city Name : ");
		address.setCityName(read.nextLine());
		System.out.print("Enter state Name : ");
		address.setStateName(read.nextLine());
		System.out.print("Enter country Name : ");
		address.setCountryName(read.nextLine());
		System.out.print("Enter pincode : ");
		address.setPinCode(read.nextLong());
		read.nextLine();	
		
		return address;
	}
	public static Person addPersonDetails() {
		Person person = new Person();
		boolean isValid = false;
		do {
			isValid = false;
			System.out.print("Enter Name : ");
			person.setPersonName(validatingString =(read.nextLine()).trim());
			try {
				isValid = validation.isUserNameValid(validatingString);
			} catch (InvalidNameException e) {
				System.out.println(e);
			}
			}while(!isValid);
		
		do {
			isValid = false;
			System.out.print("Enter Date of Birth : ");
			validatingString =(read.nextLine()).trim();
			String format = "yyyy-MM-dd";
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
			try {
				isValid = validation.isDobValid(validatingString,format);
				LocalDate date = LocalDate.parse(validatingString,dtf);
				person.setPersonDob(date);
			} catch (DateException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			}while(!isValid);
		
		int option;
		do {
		System.out.println("For age, choose one from below!!!\n1.Calculate age through system\n2.Manual Entry");
		option = read.nextInt();
		read.nextLine();
		if(option == 1) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			  //convert String to LocalDate
		//	System.out.println(validatingString);
			String format = "yyyy-MM-dd";
			  LocalDate localDate = LocalDate.parse(validatingString,formatter);
			  LocalDate date = LocalDate.now();
			  Period period = Period.between(localDate, date);
			  //System.out.println(period.getYears());
			person.setPersonAge(period.getYears());
		}else if(option ==2) {
			do {
				isValid = false;
				int age;
				System.out.print("Enter Age : ");
				person.setPersonAge(age =(read.nextInt()));
				read.nextLine();
				try {
					isValid = validation.isAgeValid(age);
				} catch (InvalidAgeException e) {
					System.out.println(e);
				}
				}while(!isValid);

		}
		}while(option !=1 && option!=2);
				
		do {
			isValid = false;
			System.out.print("Enter Mobile Number : ");
			person.setPersonMobile(validatingString =(read.nextLine()).trim());
			System.out.println(validatingString);
			try {
				isValid = validation.isMobileNumberValid(validatingString);
			} catch (InvalidMobileNumberException e) {
				System.out.println(e);
			}
			System.out.println(isValid);
			}while(!isValid);
		
		do {
			isValid = false;
			System.out.println("Select 1 from below!!!");
			person.displayGender();
			System.out.print("Enter your Gender : ");
			try {
				isValid = validation.isGenderValid(validatingString = read.nextLine());
				if(isValid) {
					if(validatingString.equals("male")) {
						person.setPersonGender(Gender.MALE);
					}
					else if(validatingString.equals("female")) {
						person.setPersonGender(Gender.FEMALE);
					}
					else {
						person.setPersonGender(Gender.TRANSGENDER);
					}
				}
			} catch (InvalidGenderException e) {
				System.out.println(e);
			}
		}while(!isValid);
		person.setPersonAddress(setAddress());
		
		do {
			isValid = false;
			System.out.print("Enter email id : ");
			person.setPersonEmailID(validatingString =(read.nextLine()).trim());
			try {
				isValid = validation.isEmailIdValid(validatingString);
			} catch (InvalidEmailIdException e) {
				System.out.println(e);
			}
			}while(!isValid);
		//admin.setPersonDetails(person);
		return person;
	}
	public static Account addAccount(boolean isAdmin) {
		
		boolean isValid = false ;
		Account account = new Account();
		//validating user name whether it has length more than 3
		do {
		isValid = false;
		System.out.print("Enter user name : ");
		account.setUserName(validatingString =(read.nextLine()).trim());
		try {
			isValid = validation.isUserNameValid(validatingString);
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
		}while(!isValid);
		
		do {
		isValid = false;
		System.out.print("Enter user password : \nwhich Contains atleast 1-uppercase, 1-lowercase, 1-specialase, 1-number : ");
		account.setPassword(validatingString =(read.nextLine()).trim());
		try {
			isValid = validation.isUserPassWordValid(validatingString);
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		}while(!isValid);
		
		if(isAdmin) {
			do{
			System.out.println("Enter 1 from below !!!");
			account.getAllUserType();
			System.out.print("Enter user type : ");
			String userType = read.nextLine();
			if((userType).equalsIgnoreCase("administrator")) {
				//account.setUserType(Type.ADMINISTRATOR);
				System.out.println("Admin can't be more than 1!!!");
			}
			else if((userType).equalsIgnoreCase("employee")) {
				account.setUserType(Type.EMPLOYEE);			
				break;
			}
			else if((userType).equalsIgnoreCase("student")) {
				account.setUserType(Type.STUDENT);
				break;
			}
			else {
				System.out.println("Enter valid user type !!!");
			}
			}while(true);
			do{
			System.out.println("Enter 1 from below !!!");
			account.getAllUserStatus();
			System.out.print("Enter user status : ");
			String userStatus = read.nextLine();
			if((userStatus).equalsIgnoreCase("active")) {
				account.setAccountStatus(AccountStatus.ACTIVE);
				break;
			}
			else if((userStatus).equalsIgnoreCase("blocked")) {
				account.setAccountStatus(AccountStatus.BLOCKED);
				break;
			}
			else if((userStatus).equalsIgnoreCase("closed")) {
				account.setAccountStatus(AccountStatus.CLOSED);
				break;
			}
			else if((userStatus).equalsIgnoreCase("cancelled")) {
				account.setAccountStatus(AccountStatus.CANCELLED);
				break;
			}
			else {
				System.out.println("Enter valid Account Status!!!");
			}
			}while(true);
		}
		else {
			account.setUserType(Type.STUDENT);
			account.setAccountStatus(AccountStatus.ACTIVE);
		}
		return account;
	}
	public static void adminLogin(Admin admin) {
		//Admin admin = new Admin();
		System.out.print("Enter user name : ");
		//checking username
		if(admin.isCorrectUserName(read.nextLine(),1)) {
			System.out.print("Enter user password : ");
			//checking password
			if(admin.isCorrectPassword(read.nextLine())) {
				int option;
				do {
				System.out.println("++++++++++ADMIN MENU++++++++++++");
				System.out.println("1.Add user\n2.Display user details\n3.Display person details\n4.Back\n5.Exit");
				System.out.println("++++++++++++++++++++++++++++++++");
				System.out.print("Enter your option : ");
				option = read.nextInt();
				read.nextLine();
				switch(option) {
				case 1:
					Person person =addPersonDetails();
					Account a = addAccount(true);
					Employee employee = new Employee();
					 if(a.getUserType() == Type.ADMINISTRATOR) {
							
						}
						else if(a.getUserType() == Type.EMPLOYEE) {
							employee.setemployeeID();
							System.out.print("Enter employee designation : ");
							employee.setemployeeDesignation(read.nextLine());
							admin.addEmployee(employee);
						}
						else if(a.getUserType() == Type.STUDENT) {
							
						}
					person.setPersonAccount(a);
					admin.addAccount(a);
					admin.setPersonDetails(person);
					
					System.out.println("Account created successfully!!!");
					break;
				case 2:
					admin.displayAccounts();
					break;
				case 3:
					admin.displayPersonDetails(admin);
					//admin.getEmploye();
					break;
				case 4:
					break;
				case 5:
					System.exit(0);
				}
				
				}while(option!=4);
			}
			else {
				System.out.println("Incorrect Password!!!");
			}
		}
		else {
			System.out.println("Incorrect User Name!!!");
		}
	}
	public static void employeeLogin() {
		Admin admin = new Admin();
		System.out.print("Enter user name : ");
		//checking username
		if(admin.isCorrectUserName(read.nextLine(), 0)) {
			System.out.print("Enter user password : ");
			//checking password
			if(admin.isCorrectPassword(read.nextLine())) {
				int option;
				do {
				System.out.println("++++++++++employee MENU++++++++++");
				System.out.println("1.Book Movie\n2.Back\n3.Exit");
				System.out.println("++++++++++++++++++++++++++++++++");
				System.out.print("Enter your option : ");
				option = read.nextInt();
				read.nextLine();
				switch(option) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					System.exit(0);
				}
				
				}while(option!=2);
			}
		}
	}
	public static void studentLoggingIn() {
		Admin admin = new Admin();
		System.out.print("Enter user name : ");
		//checking username
		if(admin.isCorrectUserName(read.nextLine(),2)) {
			System.out.print("Enter user password : ");
			//checking password
			if(admin.isCorrectPassword(read.nextLine())) {
				int option;
				do {
				System.out.println("+++++++++STUDENT MENU++++++++++");
				System.out.println("1.\n2.\n3.\n4.Back\n5.Exit");
				System.out.println("++++++++++++++++++++++++++++++++");
				System.out.print("Enter your option : ");
				option = read.nextInt();
				read.nextLine();
				switch(option) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.exit(0);
				}
				
				}while(option!=4);
			}
		}
	}
	public static void studentLogin(Admin admin) {
		//Admin admin = new Admin();
		Person person = new Person();
		int option;
		do {
		System.out.println("+++++++student LOGIN+++++++");
		System.out.println("1.Register new Account\n2.Log into Existing Account\n3.Back\n4.Exit");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.print("Enter your option : ");
		option = read.nextInt();
		read.nextLine();
		switch(option) {
		case 1:
			Account a = addAccount(false);
			admin.addAccount(a);
			person.setPersonAccount(a);
			break;
		case 2:
			studentLoggingIn();
			break;
		case 3:
			break;
		case 4:
			System.exit(0);
		}
		}while(option!=3);
	}
	public static void main(String[] args) {
		Admin admin = new Admin();
		Scanner read = new Scanner(System.in);
		admin.addAccount("nithya", "Nithya@12345", Type.ADMINISTRATOR, AccountStatus.ACTIVE);
		admin.displayAccounts();
		int option;
		do {
		System.out.println("++++++++++++MENU++++++++++++");
		System.out.println("1.Admin\n2.Employee\n3.Student\n4.Exit");
		System.out.println("++++++++++++++++++++++++++++");
		System.out.print("Enter your option : ");
		option = read.nextInt();
		read.nextLine();
		switch(option) {
		case 1:
			adminLogin(admin);
			break;
		case 2:
			employeeLogin();
			break;
		case 3:
			studentLogin(admin);
			break;
		case 4:
			System.exit(0);
		}
		}while(option!=4);

	}

}
