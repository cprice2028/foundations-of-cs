import javax.swing.JFrame;

public class Driver01
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Square Root");
      frame.setSize(200, 100);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel01());
      frame.setVisible(true);
   }
}