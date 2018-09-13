package week3;

/**
 * 
 * @author Aaron
 *
 */
public class AlarmClock {
	
	//Region Properties
	
	/**
	 * Hour that the alarm is set to
	 */
	private int Hour = 12;
	
	/**
	 * Minute that the alarm is set to
	 */
	private int Minute = 0;
	
	/**
	 * Flag determining if the current time is AM or PM
	 */
	private boolean isAM = true;
	
	/**
	 * Flag determining if the alarm is on
	 */
	private boolean status = false;
	
	//EndRegion
	
	//Region Constructors
	
	/**
	 * Creates a new AlarmClock with the time set to 12:00 AM with the alarm off
	 */
	public AlarmClock()
	{
		
	}
	
	/**
	 * Creates a new AlarmClock with the time set to the givenHour:givenMinute AM with the alarm off
	 * @param givenHour The hour to set the alarm to
	 * @param givenMinute The minute to set the alarm to
	 */
	public AlarmClock(int givenHour, int givenMinute)
	{
		Hour = givenHour;
		Minute = givenMinute;
	}
	
	//EndRegion
	
	//Region Methods
	
	/**
	 * Increments the hour that the alarm is set to
	 */
	public void hour()
	{
		if(Hour++ == 12)
		{
			Hour = 1;
			isAM = !isAM;
		}
	}
	
	/**
	 * Gets the current status of the alarm
	 * @return Returns a flag stating whether the alarm is on, or not
	 */
	public boolean isAlarmOn()
	{
		return status;
	}
	
	/**
	 * Increments the minute that the alarm is set to, if it overflows
	 * from 59 to 0, it does not increment the hour
	 */
	public void minute()
	{
		if(Minute++ == 59)
			Minute = 0;
	}
	
	/**
	 * Sets the status of the alarm
	 * @param on boolean representation of the alarm status
	 */
	public void setAlarm(boolean on)
	{
		status = on;
	}
	
	/**
	 * Returns a string containing the alarm time in "HH:MM AM/PM" format
	 */
	public String toString()
	{
		return ((Hour < 10) ? "0" + Hour : Hour) + ":" + ((Minute < 10) ? "0" + Minute : Minute) + " " + (isAM ? "AM" : "PM");
	}
	
	//EndRegion
}
