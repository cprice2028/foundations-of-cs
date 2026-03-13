//price

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

import javax.swing.JOptionPane;

public class XCRace
{
   public static void main(String[]args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
         
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(20, 15);
      Display.setSpeed(8);
         
     
      XCRacer a = new XCRacer (2);
      Thread t1 = new Thread( a );
      t1.start();
   }
}