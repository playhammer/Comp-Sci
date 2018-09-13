/**
 * 
 */
package lab2;

/**
 * @author Aaron
 *
 */
public class AtomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atom a = new Atom(92,146,92);
		printValues(a);
		a.decay();
		printValues(a);

	}
	
	private static void printValues(Atom a)
	{
		System.out.println(a.getAtomicMass());
		System.out.println(a.getAtomicCharge());
	}

}
