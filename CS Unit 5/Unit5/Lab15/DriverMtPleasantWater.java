//Name: price    Date: 5/29

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;      
import java.util.*; 
import java.text.DecimalFormat;

interface Water
{
   public abstract String getFirstName();
   public abstract String getLastName();
   public abstract double getWater();
   public abstract int getMonths();
   public abstract double getFee();
   public abstract int compareTo(Water w);
   public abstract String toString();
}

public class DriverMtPleasantWater
{
   /*********************   main  *************************/
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Mount Pleasant Water and Sewer");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleWater());
      frame.setVisible(true);
   }
   
   
   
   /*********************   panel  *************************/
   public static class PanelSampleWater extends JPanel 
   {
      private ArrayList<Water> customers = new ArrayList<>();
      private DisplaySampleWater display;
      private int index = 0;
      private double total = 0;
   
      public PanelSampleWater() 
      {
         setLayout(new BorderLayout());
         JLabel mowing = new JLabel("Mt Pleasant Water and Sewer");
         mowing.setHorizontalAlignment(SwingConstants.CENTER);
         add(mowing, BorderLayout.NORTH);
      
         JPanel buttons = new JPanel();
         buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
      
         JButton next = new JButton("Next");
         next.addActionListener(
            e -> {
               Water current = customers.get(index++);
               total += current.getFee();
               display.updateDisplay(current, total);
              
               JOptionPane.showMessageDialog(this, "No more customers.");
               
            });
         buttons.add(next);
      
         JButton quit = new JButton("Quit");
         quit.addActionListener(e -> System.exit(0));
         buttons.add(quit);
      
         add(buttons, BorderLayout.SOUTH);
      
         display = new DisplaySampleWater();
         add(display, BorderLayout.CENTER);
      
      
      
      
         try {
            String fileName = JOptionPane.showInputDialog("Enter filename:");
            try (Scanner input = new Scanner(new File(fileName))) 
            {
               int numCustomers = Integer.parseInt(input.nextLine());
               for (int i = 0; i < numCustomers; i++) {
                  String last = input.nextLine();
                  String first = input.nextLine();
                  double waters = Integer.parseInt(input.nextLine());
                  int months = Integer.parseInt(input.nextLine());
                  Water water;
                  if (waters <= 1000)
                     water = new Customer1000Water(first, last, waters, months);
                  else if (waters <= 2000)
                     water = new Customer2000Water(first, last, waters, months);
                  else
                     water = new CustomerOver2000Water(first, last, waters, months);
                  Collections.sort(customers, Comparator.comparing(Water::getLastName));
               
               }
            }
            }catch (Exception e)
            {
               JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
            }
         
         }
      
      }
   
   
      
   /********************* display *************************/
      public static class DisplaySampleWater extends JPanel 
      {
         private JTextField lastNameField, firstNameField, waterField, monthField, feeField, totalField;
      
         public DisplaySampleWater()
         {
            setLayout(new GridLayout(6, 2, 5, 6));
         
            add(new JLabel("Last Name:"));
            lastNameField = new JTextField(15);
            add(lastNameField);
         
            add(new JLabel("First Name:"));
            firstNameField = new JTextField(15);
            add(firstNameField);
         
            add(new JLabel("Water:"));
            waterField = new JTextField(15);
            add(waterField);
         
            add(new JLabel("Months:"));
            monthField = new JTextField(15);
            add(monthField);
         
            add(new JLabel("Fee:"));
            feeField = new JTextField(15);
            add(feeField);
         
            add(new JLabel("Total Fees:"));
            totalField = new JTextField(15);
            add(totalField);
         }
      
         public void updateDisplay(Water y, double runningTotal) 
         {
            DecimalFormat df = new DecimalFormat("#.00");
            lastNameField.setText(y.getLastName());
            firstNameField.setText(y.getFirstName());
            waterField.setText(String.valueOf(y.getWater()));
            monthField.setText(String.valueOf(y.getMonths()));
            feeField.setText("$" + df.format(y.getFee()));
            totalField.setText("$" + df.format(runningTotal));
         }
      }
   
   
   /***********************  Customer1000Water  ************************/
      public static class Customer1000Water implements Water
      { 
         String firstName, lastName;
         double water;
         int months;
      
         public Customer1000Water(String first, String last, double water, int months)
         {
            firstName = first;
            lastName = last;
            this.water = water;
            this.months = months;
         }
      
         public String getFirstName() 
         {
            return firstName;
         }
      
         public String getLastName()
         {
            return lastName;
         }
      
         public double getWater()
         {
            return water;
         }
      
         public int compareTo(Water y)
         {
            return lastName.compareToIgnoreCase(y.getLastName());
         }
      
         public int getMonths() 
         {
            return months;
         }
      
         public String toString() 
         {
            DecimalFormat df = new DecimalFormat("#.00");
            return lastName + ", " + firstName + " - " + water + " gallons" + months + "months , Fee: $" + df.format(getFee());
         }
      
         public double getFee() {
         
            return water * 0.03 + months*10;
         }
      }
   
   
   
   /***********************  Customer2000Water  ************************/ 
      public static class  Customer2000Water implements Water
      { 
         String firstName, lastName;
         int months;
         double water;
      
         public  Customer2000Water(String first, String last, double water, int months)
         {
            firstName = first;
            lastName = last;
            this.water = water;
            this.months = months;
         }
      
         public String getFirstName() 
         {
            return firstName;
         }
      
         public String getLastName()
         {
            return lastName;
         }
      
         public double getWater()
         {
            return water;
         }
      
         public int compareTo(Water y)
         {
            return lastName.compareToIgnoreCase(y.getLastName());
         }
      
         public int getMonths() 
         {
            return months;
         }
      
         public String toString() 
         {
            DecimalFormat df = new DecimalFormat("#.00");
            return lastName + ", " + firstName + " - " + water + " gallons" + months + "months , Fee: $" + df.format(getFee());
         }
      
         public double getFee() {
            int m = months*10;
            double w = water-1000;
            return 30 + m + w*0.02;
         }
      }
   
   
   
   /***********************  CustomerOver2000Water *************************/
   
      public static class CustomerOver2000Water implements Water
      { 
         String firstName, lastName;
         int months;
         double water;
      
         public CustomerOver2000Water(String first, String last, double water, int months)
         {
            firstName = first;
            lastName = last;
            this.water = water;
            this.months = months;
         }
      
         public String getFirstName() 
         {
            return firstName;
         }
      
         public String getLastName()
         {
            return lastName;
         }
      
         public double getWater()
         {
            return water;
         }
      
         public int compareTo(Water y)
         {
            return lastName.compareToIgnoreCase(y.getLastName());
         }
      
         public int getMonths() 
         {
            return months;
         }
      
         public String toString() 
         {
            DecimalFormat df = new DecimalFormat("#.00");
            return lastName + ", " + firstName + " - " + water + " gallons" + months + "months , Fee: $" + df.format(getFee());
         }
      
         public double getFee() {
            int m = months*10;
            double w = water-2000;
            return 50 + m + w*0.015;
         }
      }
          
   }
