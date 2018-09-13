package lab2;

public class stringTest {
	
	public static void main(String[] args)
	{
		String message = "Hello, World!";
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(0);
		System.out.println(theChar);

		theChar = message.charAt(1);
		System.out.println(theChar);
		
		System.out.println(message.toUpperCase());
		System.out.println(message.substring(0, 5));
		System.out.println(message.replace('o', '*'));
	}

}
