/*
 * This program can change a number of pennies into quarters, nickels, and dimes
 */

public class Change
{
	public static void main(String[] args)
	{
		
		int cents = 67;
		
		ChangeCluster c = CalcChange(cents);
		
		System.out.println("Quarters: " + c.Quarters);
		System.out.println("Dimes: " + c.Dimes);
		System.out.println("Nickels: " + c.Nickels);
		System.out.println("Pennies: " + c.Pennies);
		
	}
	
	public static ChangeCluster CalcChange(int cents)
	{
		ChangeCluster temp = new ChangeCluster();
		temp.Quarters = cents/25;
		cents = cents % 25;
		temp.Dimes = cents/10;
		cents = cents % 10;
		temp.Nickels = cents/5;
		temp.Pennies = cents % 5;
		
		return temp;
	}
	
}