package lab3;

public class RabbitModel2 {
	
	private static final int INITIAL_POPULATION = 2;
	private static final int POPULATION_YEARLY_INCREMENT = 1;
	private static final int POPULATION_YEARLY_DECREMENT = 0;
	
	private int populationCount = INITIAL_POPULATION;
	
	public int getPopulation()
	{
		return populationCount;
	}
	
	public void simulateYear()
	{
		populationCount += POPULATION_YEARLY_INCREMENT - POPULATION_YEARLY_DECREMENT;
	}
	
	public void reset()
	{
		populationCount = INITIAL_POPULATION;
	}
}
