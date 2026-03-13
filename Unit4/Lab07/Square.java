public class Square extends Rectangle
{
 
      
   	
   	/************************************************************* 
   	* Constructs a square with initial radius specified by x.
   	* @param x    initial radius
   	**************************************************************/
   public Square(double x)
   {
      super(x,x);
      
   }
   	
   	/*************************************************************** 
   	* Returns the square's radius
   	* @return	 radius
   	**************************************************************/
   public double getSide()
   {
      return getLength();
   }
   public void setSide(double x)
   {
      setLength(x);
      setHeight(x);
   }
      
		
   	/***************************************************************
   	* Sets the radius to the input number.
   	* @param x	 assigns x to myRadius
   	**************************************************************/
      
}
