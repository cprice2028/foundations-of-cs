	//Name Price Date 9/24
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Harvester extends Robot implements Workable
{
   public Harvester(int x, int y)
   {
      super(x, y, Display.EAST, 0);
   }
   public Harvester()
   {
      super(2, 2, Display.EAST, 0);
   }
   public void workCorner()
   {
      if (nextToABeeper())
      {
         pickBeeper();
      }
   
   }
   public void moveOneBlock()
   {
      move(); 
      if (nextToABeeper())
      {
         pickBeeper();
      }
   }
   public void turnToTheRight()
   {
      if (nextToABeeper())
      {
         pickBeeper();
      }
      turnLeft();turnLeft();turnLeft();
   }
   public void turnToTheNorth()
   {
      if (nextToABeeper())
      {
         pickBeeper();
      }
      while (!facingNorth())
      {turnLeft();}
   }
}