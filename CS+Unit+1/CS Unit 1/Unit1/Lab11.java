//Price, 9/21
import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11
{
   public static void main(String[] args)
   {     
      Display.openWorld("maps/.map");
      Display.setSize(42, 37);
      Display.setSpeed(10);
   
      Digit first = new One (1, 9);
      Digit second = new Nine (7, 9);
      Digit third = new Three (13, 9);
      Digit fourth = new Three (19, 9);
      Digit fifth = new Six (25, 9);
      Digit sixth = new Four (31, 9);
      Digit seventh = new One (37, 9);
   
      first.display();
      second.display();
      third.display();
      fourth.display();
      fifth.display();
      sixth.display();
      seventh.display();
   }
}