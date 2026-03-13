import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel17 extends JPanel 
{
   private BumperPanel bumperPanel;
   private Timer time;
   private JButton button1, button2, button3;
   private JSlider slider;
   private int timerDelay;

   public Panel17() 
   {
      setLayout(new FlowLayout());
      bumperPanel = new BumperPanel();
      bumperPanel.setPreferredSize(new Dimension(320, 320));
      add(bumperPanel);
   
      button1 = new JButton("Randomize");
      button1.addActionListener(new Listener1());
      add(button1);
   
      button2 = new JButton("Step");
      button2.addActionListener(new Listener2());
      add(button2);
   
      button3 = new JButton("Run Animation");
      button3.addActionListener(new AnimationControlListener()); 
      add(button3);
   
      add(new JLabel("Change the slider below to adjust the delay."));
      slider = new JSlider(1, 200, 50); 
      slider.setInverted(true);
      slider.addChangeListener(
         e -> {
            int newDelay = slider.getValue();
            time.setDelay(newDelay);  
         
         });
      add(slider);
   
   
      time = new Timer(50, new AnimationStepListener());
   }
   private class Listener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         bumperPanel.jumpAll();
         bumperPanel.stepAnimation();
      }
   }
   private class Listener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         timerDelay = slider.getValue();
         time.setDelay(timerDelay);
         bumperPanel.stepAnimation();
      }
   }

  
   private class AnimationStepListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         bumperPanel.stepAnimation();
         
      }
   }

   
   private class AnimationControlListener implements ActionListener 
   {
      public void actionPerformed(ActionEvent e) 
      {
         System.out.println("Before Click: Timer running? " + time.isRunning());
         if (time.isRunning()) {
            time.stop();
            button3.setText("Start Again");
            button2.setEnabled(true);
         } else {
            time.start();
            button3.setText("Pause Animation");
            button2.setEnabled(false);
         }
         System.out.println("After Click: Timer running? " + time.isRunning());
      }
   }
}
