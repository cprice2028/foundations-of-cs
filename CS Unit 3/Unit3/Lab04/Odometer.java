	//Name price_____ Date__12/19_
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
    public class Odometer extends JPanel
   {
     
   private JLabel label1, label2, label3;
   private int count1; 
   private int count2; 
   private int count3;
   
   
       public Odometer()
      {
      setLayout(new FlowLayout());
      count1 = 0;
      count2 = 0;
      count3 = 0;
   
      label1 = new JLabel(""+count1);
      label1.setFont(new Font("Serif", Font.BOLD, 100));
    
      add(label1);
   
      label2 = new JLabel(""+count2);
      label2.setFont(new Font("Serif", Font.BOLD, 110));
            add(label2);
   
      label3 = new JLabel(""+count3);
      label3.setFont(new Font("Serif", Font.BOLD, 120));
           add(label3);
   
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel);  
      
      JButton button = new JButton("Step");
      button.addActionListener(new Listener());
      panel.add(button);
   
                 }
       public void update()
      {
         
     
     
     
         	
       }
   }