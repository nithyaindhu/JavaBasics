/**
 * 
 */
package com.functions;

/**Get the salary per month and hike from user and the write a 
 * java program to calculate new salary with hike.
 * Hint: The formula is Salary hike = oldSalaryPerMonth + (oldSalaryPerMonth X hike/100)
 * @author HP
 * @since 28/11/2022
 */
import java.util.Scanner;
public class SalaryWithHike {

	/**
	 * @param args
	 */
	public static double newSalary(double salary, int hike)
	{
		double newSalaryWithHike= salary + (double)(salary * hike/100);
		return newSalaryWithHike;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.println("Enter the salary per month : ");
		double salaryPerMonth = read.nextDouble();
		System.out.println("Enter hike : ");
		int hike = read.nextInt();
		System.out.println("new Salary is " + newSalary(salaryPerMonth,hike));
		read.close();
	}

}
