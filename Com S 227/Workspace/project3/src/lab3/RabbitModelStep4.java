package lab3;

public class RabbitModelStep4 {
	
	private static final int INITIAL_POPULATION = 1;
	//private static final int POPULATION_YEARLY_INCREMENT = 0;
	//private static final int POPULATION_YEARLY_DECREMENT = 0;
	
	private int populationCount = INITIAL_POPULATION;
	private int previousYear = INITIAL_POPULATION;
	private int previousPreviousYear = 0;

	public int getPopulation()
	{
		return populationCount;
	}
	
	public void simulateYear()
	{
		previousPreviousYear = previousYear;
		previousYear = populationCount;
		populationCount += previousYear + previousPreviousYear;
	}
	
	public void reset()
	{
		populationCount = INITIAL_POPULATION;
		previousYear = INITIAL_POPULATION;
		previousPreviousYear = 0;
	}
}
