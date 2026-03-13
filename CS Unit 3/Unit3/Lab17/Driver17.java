//Name: price   Date: 1/31

import javax.swing.JFrame;

/*  Objective:
    Combining a Unit 3 panel and buttons with Unit 2 Graphics. 	
    */
public class Driver17
{
   /* The driver hasa JFrame which hasa Panel17 object.
      */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Mixing Graphics and GUIs");
      frame.setSize(400, 200);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel17());
      frame.setVisible(true);
   }

}