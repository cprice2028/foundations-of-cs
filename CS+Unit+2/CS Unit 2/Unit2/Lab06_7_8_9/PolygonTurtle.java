	//Name__Charles Price Date 11/8
import edu.fcps.Turtle;
public class PolygonTurtle extends Turtle
{
   private double mySize;
   private int mySides;
   public PolygonTurtle()
   {
      super();
      mySize = 50.0;
      mySides = 6;
   }
   public PolygonTurtle(double n, int s)
   {
      mySize = n;
      mySides = s;
   }
   public PolygonTurtle(double x, double y, double h, double n, int s)
   {
      super(x, y, h);
      mySize = n;
      mySides = s;
   }
   public void setSize(double n)
   {
      mySize = n;
   }
   public void setSides(int s)
   {
      mySides = s;
   }
   public void drawShape()
   { 
      for (int s = 0; s<mySides; s++)
      {
         forward(mySize);
         turnLeft(mySides/360.0);   
      }    
   }
   public void drawShape(int s)
   {
      setSides(s); 
      for (int a = 0; a<mySides; a++)
      {
         forward(mySize);
         turnLeft(360/mySides);
      }
   }
}