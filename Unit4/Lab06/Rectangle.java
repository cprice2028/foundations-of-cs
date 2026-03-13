public class Rectangle extends Shape
{
   private double myRadius, myLength, myHeight;
      
   	
   	/************************************************************* 
   	* Constructs a rectangle with initial radius specified by x.
   	* @param x    initial radius
   	**************************************************************/
   public Rectangle(double x, double y)
   {
      myLength = x;
      myHeight = y;
   }
   	
   	/*************************************************************** 
   	* Returns the rectangle's radius
   	* @return	 radius
   	**************************************************************/
   public double getHeight()
   {
      return myHeight;
   }
   public double getLength()
   {
      return myLength;
   }
		
   	/***************************************************************
   	* Sets the radius to the input number.
   	* @param x	 assigns x to myRadius
   	**************************************************************/
   public void setHeight(double x)
   {
      myHeight = x;
   }
   public void setLength(double y)
   {
      myLength = y;
   }
		
   	/***************************************************************
   	* Calculates and returns the rectangle's area.
   	* @return	 area
   	**************************************************************/
   public double findArea()
   {
      return myHeight*myLength;
   }
		
   	/**************************************************************
   	* Calculates and returns the rectangle's circumference.
   	* @return	 circumference
   	**************************************************************/
   public double findPerimeter()
   {
      return myHeight*2+myLength*2;
   }
   public double findDiagonal()
   {
   return Math.sqrt(Math.pow(myHeight, 2) + Math.pow(myLength, 2));
    
   } 
}