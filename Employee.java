/**
 * 
 */
package com.PersonDetail;

/**
 * @author HP
 *
 */
public class Employee extends Person {
	private String employeeID;
	private String employeeDesignation;
	private static long id = 0;
	/**
	 * @return the employeeID
	 */
	public String getemployeeID() {
		return employeeID;
	}
	/**
	 * @return the employeeDesignation
	 */
	public String getemployeeDesignation() {
		return employeeDesignation;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setemployeeID() {
		employeeID = "LMS" + getId();
	}
	/**
	 * @param employeeDesignation the employeeDesignation to set
	 */
	public void setemployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	/**
	 * @return the id
	 */
	public static long getId() {
		id += 1;
		return id;
	}
	public void displayemployeeDetails() {
		displayPersonDetails();
		System.out.println("employee Id : "+ employeeID);
		System.out.println("employee designation : "+ employeeDesignation);
	}
	
	@Override
	public String toString() {
		return "employee [employeeID=" + employeeID + ", employeeDesignation=" + employeeDesignation + "]";
	}
	
}
