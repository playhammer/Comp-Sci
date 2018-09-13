package lab3;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		/*
		String s = "Hello";
	    char c = s.charAt(10);
	    System.out.println(s);
	    
	    Person p = new Person("Aaron", 23);
	    
	    System.out.println("Name: " + p.getName());
	    System.out.println("Age: " + p.getAge());
	    
	    p.getNameLength();
	    
	    String s = "Hello";
	    s = "23Skidoo";
	    int x = Integer.parseInt(s);
	    
	    System.out.println("Max Value: " + Integer.MAX_VALUE);
	    System.out.println("Min Value: " + Integer.MIN_VALUE);
	    
	    int i = Integer.MAX_VALUE;
	    i += 1;
	    i += 2;
	    */
	    Random rand = new Random();
	    //Random rand = new Random(137);
	    System.out.println(rand.nextInt(6));
	    System.out.println(rand.nextInt(6));
	    System.out.println(rand.nextInt(6));
	    System.out.println(rand.nextInt(6));
	}
	
	// Step 1
	private int mod7(int number)
	{
		return number % 7;
	}

}
