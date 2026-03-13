//Torbert, e-mail: smtorbert@fcps.edu    version 4.4.2003
//Billington, mlbillington@fcps.edu   date 2/14/2024
//
import java.awt.*;
import javax.swing.*;
//
public class StringManiaDriver
{
   public static void main(String[] args)
   {
      JFrame f = new JFrame("String Mania!");
      f.setSize(900,600);
      f.setLocation(100,50);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setContentPane(new StringManipulationPanel());
      f.setVisible(true);
   }
}
//
// end of file
//