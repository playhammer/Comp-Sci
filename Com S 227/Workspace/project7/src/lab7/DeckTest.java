package lab7;

import java.util.Random;

public class DeckTest
{
  public static void main(String[] args)
  {
	  int[] random_bs = new int[] {-1, -2, 3, 4, 5, 8, 9, -9};
	  
	  random_bs = FuckThePolice.getPositiveNumbers(random_bs);
	  
	  System.out.print("[");
	  for(int i : random_bs)
		  System.out.print(i + " ");
	  System.out.println("] expected [3, 4, 5, 8, 9]");
	  
    Random rand = new Random(42);  // "seed" the random number generator with a value we choose
    Deck deck = new Deck(rand);    // construct the deck to use that generator
    Card[] hand = deck.select(5);
    System.out.println(Card.toString(hand));
  }
}