package mini2;

import java.util.*;

public class HipHipArray {
	
	private HipHipArray()
	{
		
	}
	
	private static int[] convertListToArray(List<Integer> l)
	{
		int[] temp = new int[l.size()];
		for(int i = 0; i < l.size(); i++)
			temp[i] = l.get(i);
		return temp;
	}
	
	public static int[] createPalindrome(int[] arr)
	{
		List<Integer> result = new ArrayList<Integer>();
		
		// Converts the array to a list
		for(int i : arr)
			result.add(i);
		
		// Creates the palindrome
		for(int i = arr.length - 2; i >= 0; i--)
			result.add(arr[i]);
		
		return convertListToArray(result);
	}
	
	public static boolean isPermutation(int[] arr)
	{
		List<Integer> test = new ArrayList<Integer>();
		
		// Converts arr to a list for use of the .contains(i) method
		for(int i : arr)
			test.add(i);
		
		for(int i = 0; i < arr.length; i++)
			if(!test.contains(i))
				return false;
		return true;
	}
	
	public static int[] longestRun(int[] arr)
	{
		List<Integer> result = new ArrayList<Integer>(), result_temp = new ArrayList<Integer>();
		result.add(arr[0]);
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] <= arr[i + 1])
			{
				if(result_temp.isEmpty())
					result_temp.add(arr[i]);
				
				result_temp.add(arr[i + 1]);
			}
			else
			{
				if(result_temp.size() > result.size())
				{
					if(!result.isEmpty())
						result.clear();
					
					for(Integer j : result_temp)
						result.add(j);
				}
				
				result_temp.clear();
			}
		}
		
		if(result_temp.size() > result.size())
		{
			if(!result.isEmpty())
				result.clear();
			
			for(Integer j : result_temp)
				result.add(j);
		}
		
		return convertListToArray(result);
	}
	
	public static int[] makeHistogram(double[] data, int numBins, double min, double max)
	{
		int[] result = new int[numBins];
		Arrays.fill(result, 0);
		
		for(double d : data)
		{
			int index = (int)Math.floor((d - min) / ((max - min) / (double)(numBins)));
			if(index < numBins && index >= 0)
				result[index]++;
		}
		
		return result;
	}
	
	public static boolean[] makeSieve(int size, int[] divisors)
	{
		boolean[] result = new boolean[size];
		Arrays.fill(result, true);
		
		result[0] = false;
		
		for(int j : divisors)
		{
			for(int i = 2; i <= (size / j) && (i * j) < size; i++)
			{
				if(j < size && !result[j])
					break;
				result[i * j] = false;
			}
		}
		
		return result;
	}
	
	public static String[] removeDups(String[] str)
	{
		if(str.length == 0)
			return str;
		
		ArrayList<String> result = new ArrayList(Arrays.asList(new String[]{str[0]}));
		for(String s : str)
		{
			for(int i = 0; i < result.size(); i++)
			{
				if(s.equals(result.get(i)))
					break;
				else if (i == result.size() - 1)
					result.add(s);
			}
		}
		return result.toArray(new String[result.size()]);
	}
	
	public static void rotate(int[] arr, int amount)
	{
		ArrayList<Integer> result = new ArrayList<>();
		for(int i : arr)
			result.add(i);
		Collections.rotate(result, amount);
		for(int i = 0; i < arr.length; i++)
			arr[i] = result.get(i);
	}

	public static void shift(int[] arr, int amount)
	{
	
		if(Math.abs(amount) >= arr.length)
			Arrays.fill(arr, 0);
		else
		{
			rotate(arr, amount);
			for(int i = 0; i < Math.abs(amount); i++)
				arr[((amount > 0) ? i : (arr.length - 1 - i))] = 0;
		}
		
	}
	
}
