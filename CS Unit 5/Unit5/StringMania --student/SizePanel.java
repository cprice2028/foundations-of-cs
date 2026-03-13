   //Torbert, e-mail: smtorbert@fcps.edu
	//version 4.4.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
    public class SizePanel extends JPanel
   {
      private JComponent myComponent;
       public SizePanel(JComponent arg)
      {
         myComponent = arg;
      
         setLayout(new FlowLayout());
      
         String[] list = {"4", "6", "8",  "10", "12", "14", "16", 
               "18", "20", "22", "24", "26", "28", "30"};
         JComboBox combo = new JComboBox(list);
         combo.addItemListener(new Listener());
         add(combo);
      
         int size = myComponent.getFont().getSize();
         int length = combo.getItemCount();
         int temp;
         for(int x = 0; x < length; x++)
         {
            temp = Integer.parseInt(combo.getItemAt(x).toString());
            if(size == temp)
            {
               combo.setSelectedIndex(x);
               break;
            }
         }
         combo.setSelectedIndex(6);
         Font f = myComponent.getFont();
         myComponent.setFont(new Font(f.getName(), f.getStyle(), 16));
      }
       private class Listener implements ItemListener
      {
          public void itemStateChanged(ItemEvent e)
         {
            JComboBox source = (JComboBox)e.getSource();
            Font f = myComponent.getFont();
            int size = Integer.parseInt(source.getSelectedItem().toString());
            myComponent.setFont(new Font(f.getName(), f.getStyle(), size));
         }
      }
   }