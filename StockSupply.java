/**
 * 
 */
package com.controlstructure;

/**This class StockSupply implements an application the supply stocks based on credits
 * @author HP
 * @since 29/11/2022
 */
import java.util.Scanner;
public class StockSupply {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read =  new Scanner (System.in);
		System.out.println("Enter availbale stocks : ");
		int availableStocks = read.nextInt();
		System.out.println("Enter customer needed stocks : ");
		int neededStocks = read.nextInt();
		read.nextLine();
		char credits = read.next().charAt(0);
		
		if(credits == 'Y')
		{
			if(neededStocks <= availableStocks)
			{
				System.out.println(neededStocks +" supplied ");
			}
			else
			{
				System.out.println(neededStocks +" supplied. Out of stock. Balance will be refunded.");		
			}
		}
		else
		{
			System.out.println("cannot supply");
		}
		read.close();
	}

}
