import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Buttoncolor extends JPanel
{
   private JButton button;
   public Buttoncolor()
   {
   
   
      JButton button = new JButton();
      button.setBackground(Color.RED);
      button.setOpaque(true);
      button.setBorderPainted(false);
      add(button);
   }
}

 