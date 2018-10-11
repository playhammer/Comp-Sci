package lab6;

public class aids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getFuckingInitials("Cher") + " expected 'C'");
		//System.out.println(getFuckingInitials("Edna del Humboldt von der Schooch") + " expected 'EdHvdS'");
		//System.out.println(getFirstStupidVowel("Cher") + " expected '2'");
		Lab6Example.main(new String[0]);
		SimpleLoops.main(new String[0]);
	}

	public static String getFuckingInitials(String name)
	{
		String result = "";
		String[] temp = name.split(" ");
		for(String s : temp)
			result += (s.charAt(0) == ' ') ? s.charAt(1) : s.charAt(0);
		return result;
	}

	public static int getFirstStupidVowel(String s)
	{
		for(int i = 0; i < s.length(); i++)
			if("aeiouAEIOU".contains("" + s.charAt(i)))
					return i;
		return -1;
	}
	
}
