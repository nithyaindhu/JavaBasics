/** 
 * the BloodDonation class implements an application to illustrate 
 * nested if decision making to check whether you can donate or not
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.functions;
import java.util.Scanner;
class BloodDonation
{
	public static void bloodDonation(int donorAge, double donorWeight)
	{
		if( donorAge >= 18 && donorAge <= 55)
		{
			if(donorWeight >=45)
			{
				System.out.println("You can donate your Blood and get you apples :}");
			}
			else 
			{
				System.out.println("Oops!! your Weight denies access for us to take blood from your body :{{ please come back after some months to get your apples :}");
			}
		}
		else 
		{
			System.out.println("Oops!! your age denies access for us to take blood from your body :{{ Please come back after some years to get your apples :}");
		}
	}
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		System.out.println("Enter you age :} ");
		int donorAge = read.nextInt();	//getting age
		System.out.println("Enter you weight :} ");
		double donorWeight = read.nextDouble();	//getting weight
		bloodDonation(donorAge, donorWeight);		
		read.close();
	}
}
