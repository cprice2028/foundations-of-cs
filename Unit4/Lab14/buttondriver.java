import javax.swing.*;
   public class buttondriver
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Buttoncolor");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Buttoncolor());
         frame.setVisible(true);
      }
   }