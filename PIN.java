/**
 * 
 */
package com.controlstructure;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class PIN {

	/**
	 * @param args
	 */
	public static int findingTens(int number1, int number2, int number3)
	{
		if( number1%10 < number2%10 && number1%10 < number3%10)
		{
			return number1%10;
			
		}
		else if( number2%10 < number1%10 && number2%10 < number3%10)
		{
			return number2%10;
		}
		else
		{
			return number3%10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.println("Enter number 1 : ");
		int number1 = read.nextInt();
		System.out.println("Enter number 2 : ");
		int number2 = read.nextInt();
		System.out.println("Enter number 3 : ");
		int number3 = read.nextInt();
		int revKey =0;
		
		revKey = revKey*10 + findingTens(number1, number2, number3);
		revKey = revKey*10 + findingTens(number1/10, number2/10, number3/10);
		revKey = revKey*10 + findingTens(number1/100, number2/100, number3/100);
		
		int temp = number1, max = 0, count =1;
		while(temp !=0)
		{
			if(temp%10 > max)
			{
				max = temp%10;
				
			}
			temp /= 10;
			if(temp ==0)
			{
				count++;
				if(count == 2)
				{
					temp = number2;
				}
				else if(count == 3)
				{
					temp = number3;
				}
			}
		}
		revKey = revKey*10 + max;
		int key = 0;
		while(revKey != 0)
		{
			key = key*10 + revKey%10;
			revKey/=10;
		}
		System.out.println("Key is " + key);
		read.close();
	}

}
