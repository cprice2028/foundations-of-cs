import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04
{
   public static void takeTheField(Athlete arg)
   {
      arg.move();      arg.move();      arg.move();      arg.move();       arg.turnRight();       arg.move();      arg.move(); }
   public static void main(String[] args)
   {  Display.openWorld("maps/arena.map");
      Display.setSize (10,10);
      Display.setSpeed (5);
         
      Athlete coach = new Athlete (2, 7, Display.EAST, 1);Athlete a = new Athlete();Athlete b = new Athlete();Athlete c = new Athlete();Athlete d = new Athlete();Athlete e = new Athlete();Athlete f = new Athlete();
         
      takeTheField(a);takeTheField(b);takeTheField(c);takeTheField(d);takeTheField(e);takeTheField(f);
      a.move(); a.move();
      a.move();
      a.move();
      a.move();
      a.turnLeft(); a.move();
      b.move();
      b.move();
      b.move();
      b.move();
      c.move();
      c.move();
      c.move();
      d.move();
      d.move();
      e.move();
      e.turnLeft();
      e.move();
      f.move();f.move();f.move();f.turnLeft();f.move();f.move();f.turnAround();a.turnAround(); e.turnAround();b.turnRight();c.turnRight();d.turnRight();}}

