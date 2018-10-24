package ui;
import java.util.Scanner;

import api.Descriptor;
import api.Direction;
import api.StringUtil;
import hw3.CS227Quell;
import hw3.GameSupport;


public class ConsoleUI
{


  public static final String[] test1 = {
    "  #######  ",
    " #    @  # ",
    "# @ $   @##",
    " #    @# # ",
    "  #######  "       
  };
  
  // wrap around
  public static final String[] test2 = {
    "##.###",
    "##...#",
    "#.#..#",
    "#.@@.#",
    "#...$#",
    "##.###"  
  };


  // the 'o' is a gate, that can be passed through just once, then it's closed
  public static final String[] test3 = {
    "#######",
    "##$ o #",
    "#     #",
    "#  @  #",
    "#     #",
    "#######"  
  };
  
  // spikes are deadly if you hit the pointy end (but ok on the side)
  public static final String[] test4 = {
    "#######",
    "## v  #",
    "#  @  #",
    "#     #",
    "#  $ ##",
    "#@    #",
    "#^    #",
    "#######"  
  };   
  
  // 'O' is a portal
  public static final String[] test5 = {
    "######",
    "#O  $#",
    "# @@ #",
    "#    #",
    "#@O ##",
    "#  ###",
    "######"  
  };
  
  // the '+' represents a "moveable block" that can be pushed
  public static final String[] test6 = {
    "######",
    "#   ##",
    "#$ o #",
    "# @  #",
    "# +@ #",
    "#    #",
    "#    #",
    "######"  
  };

  // if a '+' and a '-' are pushed together, they disappear
  public static final String[] test7 = {
    "#######",
    "#$ +  #",
    "##@   #",
    "#@#@  #",
    "#     #",
    "#     #",
    "# -+  #",
    "#######"  
  };
  
  public static final String[] test8 = {
    " ##### ",
    "#....##",
    "#$.O.@#",
    "#....##",
    "#.O...#",
    "#..+..#",
    "#^.##@#",
    " ##### "  
  };
  
  // we can have multiple pairs of portals ('A', 'B')
  public static final String[] test9 = {
    "##### ####",
    "#  v     #",
    "#  @   A #",
    "   @##   $",
    "#A      ##",
    "#@ B   @ #",
    "#       ##",
    "#^   B @ #",
    "##### ####"  
  };  

  
  

    public static void main(String[] args)
    {
      run(test1);
    }
    
    public static void run(String[] init) 
    {  
      Scanner in = new Scanner(System.in);
      CS227Quell g = new CS227Quell(init, new GameSupport());
      
      System.out.println("Move the player ('$') to collect all the pearls ('@').");
      System.out.println("You can go off the edge and wrap around to the opposite side.");
      System.out.println("An 'o' is an open gate, but you can only pass through it once.");
      System.out.println("Watch out for the spikes ('<', '>', '^', 'v', '*')!");
      System.out.println("An 'O' is a portal, you come out the other portal in the same direction.");
      System.out.println("Blocks '+' and '-' can be pushed, and a '+' will combine with a '-' and vanish.");
      System.out.println();
      
      StringUtil.printGrid(g);
      
      while (!g.isOver())
      {
        System.out.println("Enter w, a, s, or d to move: ");
        String s = in.nextLine();
        Descriptor[] desc = null;
        if (s.startsWith("a"))
        {
          desc = g.move(Direction.LEFT);
        }
        else if (s.startsWith("d"))
        {
          desc = g.move(Direction.RIGHT);
        }
        else if (s.startsWith("w"))
        {
          desc = g.move(Direction.UP);
        }
        else if (s.startsWith("s"))
        {
          desc = g.move(Direction.DOWN);
        }
        
        StringUtil.printGrid(g);
        
// Examine the descriptors if you have them...
//        if (desc != null)
//        {
//          for (Descriptor d : desc)
//          {
//            System.out.println(d);
//          }
//        }
        
      }
    }
    
  }
