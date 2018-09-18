package lab4;

import postage1.PostageUtil;
import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		// Sets up scanner
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try
			{
				System.out.println(PostageUtil.computePostage(sc.nextDouble()));
			}
			catch(InputMismatchException e)
			{
				// Leaves an exit to the infinite loop
				System.out.println("Invalid argument, exitting...");
				sc.close();
				break;
			}
		}
	}

}
