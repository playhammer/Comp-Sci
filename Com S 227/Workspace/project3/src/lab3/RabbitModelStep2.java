package lab3;

public class RabbitModelStep2 {
	
	private static final int INITIAL_POPULATION = 2;
	private static final int POPULATION_YEARLY_INCREMENT = 500;
	private static final int POPULATION_YEARLY_DECREMENT = 0;
	
	private int populationCount = INITIAL_POPULATION;
	
	public int getPopulation()
	{
		return populationCount;
	}
	
	public void simulateYear()
	{
		populationCount += POPULATION_YEARLY_INCREMENT - POPULATION_YEARLY_DECREMENT;
		populationCount /= 2;
	}
	
	public void reset()
	{
		populationCount = INITIAL_POPULATION;
	}
}
