import javax.swing.JFrame;
public class Driver11
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Picking rocks");
      frame.setSize(300, 300);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel11());
      frame.setVisible(true);
   }
}