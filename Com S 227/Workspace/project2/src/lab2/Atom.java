/**
 * 
 */
package lab2;

/**
 * @author Aaron
 * A class that embodies an atom.
 */
public class Atom {
	
	/**
	 * The number of protons that the atom has
	 */
	private int Protons = 0;
	
	/**
	 * The number of neutrons that the atom has
	 */
	private int Neutrons = 0;
	
	/**
	 * The number of electrons that the atom has
	 */
	private int Electrons = 0;
	
	/**
	 * Generates a new atom object
	 * @param givenProtons The number of protons that the atom has
	 * @param givenNeutrons The number of neutrons that the atom has
	 * @param givenElectrons The number of electrons that the atom has
	 */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
	{
		Protons = givenProtons;
		Neutrons = givenNeutrons;
		Electrons = givenElectrons;
	}
	
	/**
	 * Gets the atomic mass
	 * The number of protons plus the neutrons
	 * @return Returns the atomic mass
	 */
	public int getAtomicMass()
	{
		return Protons + Neutrons;
	}
	
	/**
	 * Returns the atomic charge (The protons minus the electrons)
	 * @return Returns the atomic charge
	 */
	public int getAtomicCharge()
	{
		return Protons - Electrons;
	}
	
	/**
	 * Sends the atom through an atomic decay (divides the protons and the neutrons by 2)
	 */
	public void decay()
	{
		Protons -= 2;
		Neutrons -= 2;
	}

}
