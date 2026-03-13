//price, 10/10


import javax.swing.JFrame;
public class Driver00
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame ("Lab00");
      frame.setSize(2000, 2000);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(
                        JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new Panel00modify());
      frame.setVisible (true);

   }
}