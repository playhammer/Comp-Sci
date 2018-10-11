package mini1;

import java.util.Arrays;

public class KeepMeInTheLoop {
	
	private KeepMeInTheLoop()
	{
		
	}
	
	public static boolean containsWithGaps(String source, String target)
	{
		// Return true if the target is empty
		if(target.isEmpty())
			return true;
		
		int t = 0;
		
		for(int i = source.indexOf(target.charAt(0)); i < source.length(); i++)
		{
			char test = source.charAt(i);
			
			// If it's not a target character then start the sequence over
			if(test == target.charAt(t))
			{
				t++;
				if(t >= target.length())
					return true;
				// If there are no more occurences, break
				if(source.indexOf(target.charAt(t), i + 1) < 0)
					return false;
				else
					i = source.indexOf(target.charAt(t), i + 1) - 1;	// Skip to the next occurence
			}
			// We found every character
			else if (t >= target.length())
				return true;
		}
		return false;
	}
	
	public static String doubleConsonants(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(!("aeiouAEIOU".contains("" + c)) && 
					((i >= s.length() - 1) || c != s.charAt(i+1)) && 
					((i == 0) || c != s.charAt(i-1)))
			{
				String pre = s.substring(0, i+1);
				String suf = s.substring(i+1);
				s = pre + c + suf;
				i++;
			}
		}
		return s;
	}
	
	public static int findNth(String s, char ch, int n)
	{
		int tot = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==ch)
				if(++tot==n)
					return i;
		}
		return -1;
	}
	
	public static int findSecondLargest(String nums)
	{
		String[] actNums = nums.split(" ");
		int[] realNums = new int[actNums.length];
		for(int i = 0; i < actNums.length; i++)
			realNums[i] = Integer.parseInt(actNums[i]);
		Arrays.sort(realNums);
		return realNums[realNums.length - 2];
	}
	
	public static int findStoppingTime(int n)
	{
		if(n <= 0)
			return -1;
		
		int count = 0;
		while(n != 1)
		{
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
			count++;
		}
		
		return count;
	}
	
	public static int howLong(double balance, double monthlyCost, double interestRate, double increase)
	{
		int count = 0;
		while (balance >= monthlyCost)
		{
			balance -= monthlyCost;
			balance *= 1 + (interestRate / 12);
			monthlyCost += increase;
			count++;
		}
		return count;
	}

	public static boolean isIBeforeE(String s)
	{
		String temp = s.toLowerCase();
		
		// If there is no e, it follows the rule
		if(!temp.contains("e") || !temp.contains("i"))
			return true;
		
		// Systematically checks every 'e' in the string
		for(int i = temp.indexOf("e"); i < temp.length(); i += (temp.contains("e") ? temp.indexOf("e") : temp.length()))
		{
			if((i > 0 && temp.charAt(i - 1) == 'i') && 
					(i <= 1 || temp.charAt(i - 2) == 'c'))
			{
				return false;
			}
			else if ((i < temp.length() - 1) && 
					(i == 0 || temp.charAt(i - 1) != 'c') && 
					temp.charAt(i + 1) == 'i')
				return false;
			
			temp = temp.substring(temp.indexOf("e") + 1);
			i = 0;
		}
		
		return true;
	}

	public static boolean isPermutation(String s, String t)
	{
		for(char c : t.toCharArray())
		{
			if(!s.contains("" + c))
				return false;
			else
				s = s.replaceFirst("" + c, "");
		}
		
		return s.isEmpty();
	}

	
}
