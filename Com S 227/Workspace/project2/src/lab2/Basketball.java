package lab2;

public class Basketball
{

 

  // Instance variables represent the state or attributes (Click to hide)


  private boolean isInflated;
  private double diameter;



 

  // Constructors initialize the instance variables (Click to hide)


  public Basketball(double givenDiameter)
  {
    isInflated = false;
    diameter = givenDiameter;
  } 



 

  // Methods define the operations (Click to hide)


  public double getDiameter()
  {
    return diameter;
  }
  
  public boolean isDribbleable()
  {
    // can be dribbled only if it is inflated
    return isInflated;
  }
  
  public double getCircumference()
  {
    double result = Math.PI * diameter;
    return result;
  }
  
  public void inflate()
  {
    isInflated = true;
  }


}
