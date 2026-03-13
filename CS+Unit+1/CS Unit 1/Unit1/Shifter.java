//Price 9/28
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Shifter extends Robot implements Runnable, Workable
{
   private int myBeepers = 0;
   public Shifter(int y)
   {
      super(1, y, Display.EAST, 0);
   
   }
   public void workCorner()
   {
      while (!nextToABeeper())
      {
         move();
      }
      while (nextToABeeper())
      {
         pickBeeper(); myBeepers++;
      }
      turnLeft();
      turnLeft();
      move();
      if (hasBeepers())
      {
         for(int k=1; k<=myBeepers; k++)
         {
            putBeeper();
            
         }
      }
      turnLeft();
      turnLeft();
   }
   public void run()
   {
      move();move();move();move();move();move();turnLeft();
      turnLeft();
      while (frontIsClear())
      {
         workCorner();
      }
      
   }
 
   public void moveOneBlock()
   {
      
   }
   public void turnToTheRight()
   {
      
   }
   public void turnToTheNorth()
   {
   }
}