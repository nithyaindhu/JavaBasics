
/**
 * 
 */

/** this class EmployeeOvertimepay implements an application to 
 * calculate overtime pay for 5 employees.
 * @author HP
 * @since 28/11/2022
 */
package com.functions;
import java.util.Scanner;
public class EmployeeOvertimePay {
	
	int overtimePay( int workingHours)
	{
		if (workingHours>=40)
		{
			return workingHours*15;
		}
		return workingHours*10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		EmployeeOvertimePay  e[] = new EmployeeOvertimePay [5];
		
		for(int i =0 ; i<5 ; i++)
		{
			System.out.println("Enter employee "+ (i+1)+ " working hours : ");
			e[i] = new EmployeeOvertimePay();
			System.out.println("overtime pay for employee "+ (i+1)
					+" is "+ e[i].overtimePay(read.nextInt()));
			
		}
		read.close();
	}

}
