package lab7;

import java.util.ArrayList;
import java.util.Random;

public class FuckThePolice {
	
	public static int[] convertListToArray(ArrayList<Integer> l)
	{
		int[] result = new int[l.size()];
		for(int i = 0; i < l.size(); i++)
			result[i] = l.get(i);
		return result;
	}
	
	public static int[] getPositiveNumbers(int[] arr)
	{
		ArrayList<Integer> result = new ArrayList<>();
		for(int i : arr)
			if(i > 0)
				result.add(i);
		return convertListToArray(result);
	}

	
	public static int[] randomExperiment(int max, int iters)
	{
		Random rng = new Random();
		int[] bins = new int[max];
		for(int i = 0; i < iters; i++)
			bins[rng.nextInt(max)]++;
		return bins;
	}
	
	public static int[] getRandomArray(int max, int iters)
	{
		Random rng = new Random();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i < iters; i++)
		{
			int n = rng.nextInt(max);
			while(result.contains(n))
				n = rng.nextInt(max);
			result.add(n);
		}
		return convertListToArray(result);
	}
}
