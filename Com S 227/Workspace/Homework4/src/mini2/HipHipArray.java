package mini2;

import java.util.*;

public class HipHipArray {
	
	static int[] convertListToArray(List<Integer> l)
	{
		int[] temp = new int[l.size()];
		for(int i = 0; i < l.size(); i++)
			temp[i] = l.get(i);
		return temp;
	}
	
	static int[] createPalindrome(int[] arr)
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
	
	static boolean isPermutation(int[] arr)
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
	
	static int[] longestRun(int[] arr)
	{
		List<Integer> result = new ArrayList<Integer>(), result_temp = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++)
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
					
					result_temp.clear();
				}
			}
		}
		
		return convertListToArray(result);
	}
	
	static int[] makeHistogram(double[] data, int numBins, double min, double max)
	{
		List<Double> temp_data = new ArrayList<Double>();
		for(double d : data)
			temp_data.add(d);
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < data.length; i++)
		{
			
		}
	}

}
