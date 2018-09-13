package lab3;

import java.util.Random;

public class RabbitModelStep3 {
	
	private static final int INITIAL_POPULATION = 2;
	private static final int POPULATION_YEARLY_INCREMENT = 10;
	private static final int POPULATION_YEARLY_DECREMENT = 0;
	private static final int RANDOM_SEED = 2147483647;
	
	private int populationCount = INITIAL_POPULATION;
	private Random rng;
	
	public RabbitModelStep3()
	{
		rng = new Random(RANDOM_SEED);
	}
	
	public int getPopulation()
	{
		return populationCount;
	}
	
	public void simulateYear()
	{
		populationCount += rng.nextInt(POPULATION_YEARLY_INCREMENT);
	}
	
	public void reset()
	{
		populationCount = INITIAL_POPULATION;
		rng = new Random(RANDOM_SEED);
	}
}
