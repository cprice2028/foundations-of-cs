//Price, 10/7
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class ObstacleCourse
{
   public static void main(String[]args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
         
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(20, 15);
      Display.setSpeed(8);
         
     
      CliffClimber a = new CliffClimber ();
      Collector b = new Collector();
      Thread t1 = new Thread( a );
      Thread t2 = new Thread( b );
      t1.start();
      t2.start();
   }
}