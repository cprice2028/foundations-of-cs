//Price 8/29
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(10);
      
      Climber karel = new Climber(8);
      Climber zaman = new Climber(8);
      
      zaman.turnRight();
      karel.turnRight();
      zaman.move();
      karel.move();
      karel.climbUpRight();
      zaman.climbUpRight();
      karel.climbUpRight();
      zaman.climbUpRight();
      karel.climbUpRight();
      zaman.climbUpRight();
      karel.climbDownRight();
      zaman.climbDownRight();
      karel.climbDownRight();
      zaman.climbDownRight();
      zaman.pickBeeper();
      karel.turnAround();
      zaman.turnAround();
      karel.climbUpLeft();
      zaman.climbUpLeft();
      karel.climbUpLeft();
      zaman.climbUpLeft();
      karel.climbDownLeft();
      zaman.climbDownLeft();
      karel.climbDownLeft();
      zaman.climbDownLeft();
      karel.climbDownLeft();
      zaman.climbDownLeft();
      karel.move();
      zaman.move();
   }}
   
