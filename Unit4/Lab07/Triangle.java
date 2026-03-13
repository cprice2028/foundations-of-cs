/*****************************************************************
	* A Triangle is a Shape that maintains information about its radius. A Triangle
	* knows how to return its radius, set its radius, calculate and return its 
	* area, and calculate and return its circumference.
	 
	* @author 
	* @version 
	****************************************************************/
    public class Triangle extends Shape
   {
      private double mySide;
   	
   	/************************************************************* 
   	* Constructs a triangle with initial radius specified by x.
   	* @param x    initial radius
   	**************************************************************/
       public Triangle(double x)
      {
        mySide = x;
      }
   	
   	/*************************************************************** 
   	* Returns the triangle's radius
   	* @return	 radius
   	**************************************************************/
       public double getSide()
      {
         return mySide;
      }
		
   	/***************************************************************
   	* Sets the radius to the input number.
   	* @param x	 assigns x to myRadius
   	**************************************************************/
       public void setSide(double x)
      {
         mySide = x;
      }
		
   	/***************************************************************
   	* Calculates and returns the triangle's area.
   	* @return	 area
   	**************************************************************/
       public double findArea()
      {
         return (Math.sqrt(3) / 4) * Math.pow(mySide, 2);
      }
		
   	/**************************************************************
   	* Calculates and returns the triangle's circumference.
   	* @return	 circumference
   	**************************************************************/
       public double findPerimeter()
      {
         return mySide*3;
      }
   }