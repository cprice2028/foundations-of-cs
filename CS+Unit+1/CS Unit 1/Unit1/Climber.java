import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Climber extends Athlete
{
   public Climber()
   {
      super();
   }
   public Climber (int y)
   {
      super (1, y, Display.EAST, 0);
   }
   public void climbUpRight()
   {
      turnLeft();
      move();
      move();
      turnRight();
      move();
   }
   public void climbUpLeft()
   {
      turnRight();move();move();turnLeft();move();
   }
   public void climbDownLeft()
   {
      move();turnLeft();move();move();turnRight();
   }
   public void climbDownRight()
   {
      move();turnRight();move();move();turnLeft();
   }
}