/**
 * 
 */
package hw1;

/**
 * A simple printer class to model ink and paper usage.
 * @author Aaron
 */
public class Printer {
	
	// Constants
	
	/**
	 * Amount in ounces of ink, in a new cartridge.
	 */
	public static final double INK_CAPACITY = 2.0;
	
	/**
	 * Amount of ink in ounces used per printed page.
	 */
	public static final double INK_USAGE = 0.0023;
	
	// Properties
	
	/**
	 * The maximum amount of paper that the printer can hold
	 */
	private int paperCapacity;
	
	/**
	 * The current ink cartridge level of fullness
	 */
	private double cartridgeLevel = INK_CAPACITY;
	
	/**
	 * The current amount of paper in the paper tray
	 */
	private int paperTrayLevel = 0;
	
	private int totalPaperPrinted = 0;
	
	// Constructors
	
	/**
	 * Creates a new printer with the given paper tray capacity, no paper and a full ink cartridge.
	 * @param givenCapacity The maximum amount of paper that the paper tray can contain.
	 */
	public Printer(int givenCapacity)
	{
		paperCapacity = givenCapacity;
	}
	
	/**
	 * Creates a new printer with the given paper tray capacity and an initial load of paper equal to the givenNumberOfSheets and with a full ink cartridge.
	 * @param givenCapacity	The maximum amount of paper that the paper tray can hold
	 * @param givenNumberOfSheets The initial amount of paper in the paper tray
	 */
	public Printer(int givenCapacity, int givenNumberOfSheets)
	{
		paperCapacity = givenCapacity;
		paperTrayLevel = givenNumberOfSheets;
	}
	
	// Methods
	
	/**
	 * Adds paper to the paper tray not to exceed the paper capacity
	 * @param additionalSheets The number of sheets of paper to add
	 */
	public void addPaper(int additionalSheets)
	{
		paperTrayLevel = (paperTrayLevel + additionalSheets > paperCapacity) ? paperCapacity : paperTrayLevel + additionalSheets;
	}
	
	/**
	 * Gets the current amount of paper in the tray, this is never negative (duh)
	 * @return Returns the current amount of paper in the tray.
	 */
	public int getCurrentPaper()
	{
		return paperTrayLevel;
	}
	
	/**
	 * Gets the total number of sheets of paper that the printer has used since its construction
	 * @return Returns the total number of sheets of paper that the printer has used.
	 */
	public int getTotalPaperUse()
	{
		return totalPaperPrinted;
	}
	
	/**
	 * Determines if the ink is out
	 * Ink is considered out when the current ink level is less than the amount of ink required to print one sheet of paper.
	 * @return Returns a boolean flag indicating whether the ink is out, or not.
	 */
	public boolean isInkOut()
	{
		return cartridgeLevel < INK_USAGE;
	}
	
	/**
	 * Simulates the replacement of the ink Cartridge, returns the cartridgeLevel to INK_CAPACITY.
	 */
	public void replaceInk()
	{
		cartridgeLevel = INK_CAPACITY;
	}
	
	/**
	 * Simulates printing pages in one-sided mode
	 * If there isn't enough paper to complete the job, the printer uses the remaining paper and the corresponding amount of ink
	 * If there isn't enough ink to complete the job, the printer uses the remaining ink, but still prints the original number of sheets, but the sheets after the ink runs out will be blank.
	 * @param numberOfPages Number of pages to print
	 */
	public void print(int numberOfPages)
	{
		// Determines how many pages to print
		int numPagesToPrint = (numberOfPages > paperTrayLevel) ? paperTrayLevel : numberOfPages;
		
		// Determines how much ink is used and removes it from the cartridge
		cartridgeLevel = ((numPagesToPrint * INK_USAGE) > cartridgeLevel) ? 0 : cartridgeLevel - numPagesToPrint * INK_USAGE;
		
		metaPrint(numPagesToPrint);
	}
	
	/**
	 * Simulates printing pages in two-sided mode
	 * If there isn't enough paper to complete the job, the printer uses the remaining paper and the corresponding amount of ink
	 * If there isn't enough ink to complete the job, the printer uses the remaining ink, but still prints the original number of sheets, but the sheets after the ink runs out will be blank.
	 * @param numberOfPages Number of pages to print
	 */
	public void printTwoSided(int numberOfPages)
	{
		// Determines how many sheets need to be printed, since now there are two pages per sheet.
		int numberOfSheets = (numberOfPages / 2) + (numberOfPages % 2);
		// Determines how many pages to print
		int numPagesToPrint = (numberOfSheets > paperTrayLevel) ? paperTrayLevel : numberOfSheets;
		
		// Determines how much ink is used and removes it from the cartridge
		cartridgeLevel = ((numPagesToPrint * 2 * INK_USAGE) > cartridgeLevel) ? 0 : numPagesToPrint * 2 * INK_USAGE;
		
		metaPrint(numPagesToPrint);
	}
	
	/**
	 * Simulates an internal printing function for the printer, removes the sheets from their reservoirs and updates the total pages printed property
	 * @param numberOfSheets Number of physical sheets to print
	 */
	private void metaPrint(int numberOfSheets)
	{
		// Removes the paper from the tray
		paperTrayLevel -= numberOfSheets;
		
		// Updates the totalPaperPrinted variable
		totalPaperPrinted += numberOfSheets;
	}
	
}
