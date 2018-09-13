/**
 * 
 */
package week4;

/**
 * A simple class that simulates a battery
 * @author Aaron
 *
 */
public class Battery {
	
	private double minutesLeft;
	private double totalCapacity;
	
	public Battery(double givenInitialLife)
	{
		minutesLeft = givenInitialLife;
		totalCapacity = givenInitialLife;
	}
	
	public boolean isAlive()
	{
		return minutesLeft > 1;
	}
	
	public void use(double minutes)
	{
		minutes = (minutes > minutesLeft) ? 0 : minutesLeft - minutes;
	}
	
	public double lifeLeft()
	{
		return minutesLeft / totalCapacity * 100;
	}
}
