/**
 * 
 */
package com.condition;

/**This class EmployeeSalary implements an application which prints employee salary after appraisal
 * @author HP
 * @since 28/11/2022
 */
import java.util.Scanner;
public class EmployeeSalary {

	/**
	 * @param args
	 */
	public static double calculateSalary(int salary , double appraisalRating)
	{
		if(appraisalRating >= 1.0 && appraisalRating <=4.0)
		{
			return (salary * 10)/100;
		}
		else if(appraisalRating >= 4.1 && appraisalRating <=7.0)
		{
			return (salary * 25)/100;
		}
		else
		{
			return (salary * 30)/100;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the salary : ");
		int salary = read.nextInt();
		System.out.print("Enter the appraisal rating : ");
		double appraisalRating = read.nextDouble();
		if (appraisalRating <=0 || appraisalRating >10)
		{
			System.out.println("Invalid input !!!");
		}
		else
		{
			System.out.print("calculated salary : ");
			System.out.print(salary + calculateSalary(salary, appraisalRating));
		}
		read.close();
	}

}
