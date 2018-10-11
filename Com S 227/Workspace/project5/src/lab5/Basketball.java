package lab5;

public class Basketball
{
  private boolean isInflated;
  private double diameter;
  private boolean isExploded = false;

  public Basketball(double givenDiameter)
  {
    isInflated = false;
    diameter = givenDiameter;
  } 

  public double getDiameter()
  {
    return diameter;
  }
  
  public boolean isDribbleable()
  {
    // can be dribbled only if it is inflated
    return isInflated && !isExploded;
  }
  
  public double getCircumference()
  {
    double result = Math.PI * diameter;
    return result;
  }
  
  public void inflate()
  {
	  if(!isInflated && !isExploded)
		isInflated = true;
	  else
	  {
		  System.out.println("BOOOOOOOOOOOOMMMM!!!!!");
		  isInflated = false;
		  diameter = 0;
		  isExploded = true;
	  }
  }


}
