package postage1;

public class PostageUtil
{
  /**
   * Returns the cost of postage for a letter of the given weight.
   * @param weight
   *   given weight in ounces
   * @return
   *   cost of postage for the weight
   */
  public static double computePostage(double weight)
  {
	  // The second flowchart does not work because if weight is !<=1, then weight will always be >1, thus it fails for anything larger than 3.5 Oz
	  // There is nothing wrong with the third flowchart
	  
	  // Implements the first flowchart
	  return (weight<=1) ? 0.47 : ((weight<=3.5) ? 0.47 + Math.ceil(weight - 1) * 0.21 : 0.94 + Math.ceil(weight - 1) * 0.21);
  }
}