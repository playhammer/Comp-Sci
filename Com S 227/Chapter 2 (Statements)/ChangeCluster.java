/*
 * This class contains the data structure for all of the coins in the us currency
 */

public class ChangeCluster
{

	public int Quarters;
	
	public int Dimes;
	
	public int Nickels;
	
	public int Pennies;
	
	public ChangeCluster(int quarters, int dimes, int nickels, int pennies)
	{
		Quarters = quarters;
		Dimes = dimes;
		Nickels = nickels;
		Pennies = pennies;
	}
	
	public ChangeCluster()
	{
		Quarters = 0;
		Dimes = 0;
		Nickels = 0;
		Pennies = 0;
	}

}