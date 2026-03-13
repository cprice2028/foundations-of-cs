// Name: price  Date: 5/15

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

interface Yard extends Comparable<Yard>
{
   public abstract double getCost();
   public abstract String getFirstName();
   public abstract String getLastName();
   public abstract int compareTo(Yard y);
   public abstract String toString();
   public abstract int getSize();
}

public class Sample
{

   /********************* driver *************************/
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Sample Final Exam");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }

   /********************* panel *************************/
   public static class PanelSampleYard extends JPanel 
   {
      private Yard[] customers;
      private DisplaySampleYard display;
      private int index = 0;
      private double total;

      public PanelSampleYard() 
      {
         setLayout(new BorderLayout());
         JLabel mowing = new JLabel("Green and Grow Mowing Company");
         mowing.setHorizontalAlignment(SwingConstants.CENTER);
         add(mowing, BorderLayout.NORTH);

         JPanel buttons = new JPanel();
         buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

         JButton next = new JButton("Next");
         next.addActionListener(
            e -> {
               if (index < customers.length)
               {
                  Yard current = customers[index++];
                  total += current.getCost();
                  display.updateDisplay(current, total);
               } else
               {
                  JOptionPane.showMessageDialog(this, "No more customers.");
               }
            });
         buttons.add(next);

         JButton quit = new JButton("Quit");
         quit.addActionListener(e -> System.exit(0));
         buttons.add(quit);

         add(buttons, BorderLayout.SOUTH);

         display = new DisplaySampleYard();
         add(display, BorderLayout.CENTER);


         try
         {
            String fileName = JOptionPane.showInputDialog("Enter filename:");
            try (Scanner input = new Scanner(new File(fileName))) 
            {
               int numCustomers = Integer.parseInt(input.nextLine().trim());
               customers = new Yard[numCustomers];
               for (int i = 0; i < numCustomers; i++) {
                  String last = input.nextLine().trim();
                  String first = input.nextLine().trim();
                  int size = Integer.parseInt(input.nextLine().trim());

                  Yard yard;
                  if (size <= 10000)
                     yard = new CustomerSmallYard(first, last, size);
                  else if (size <= 20000)
                     yard = new CustomerMediumYard(first, last, size);
                  else
                     yard = new CustomerLargeYard(first, last, size);

                  customers[i] = yard;
               }
               selectionSort(customers);
            }
         } catch (Exception e)
         {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
         }

      }

      // Selection sort by last name
      private void selectionSort(Yard[] arr) {
         for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
               if (arr[j].getLastName().compareToIgnoreCase(arr[min].getLastName()) < 0) {
                  min = j;
               }
            }
            Yard temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
         }
      }
   }

   /********************* display *************************/
   public static class DisplaySampleYard extends JPanel 
   {
      private JTextField lastNameField, firstNameField, sizeField, costField, totalField;
   
      public DisplaySampleYard()
      {
         setLayout(new GridLayout(5, 2, 5, 5));
      
         add(new JLabel("Last Name:"));
         lastNameField = new JTextField(15);
         add(lastNameField);
      
         add(new JLabel("First Name:"));
         firstNameField = new JTextField(15);
         add(firstNameField);
      
         add(new JLabel("Lawn Size:"));
         sizeField = new JTextField(15);
         add(sizeField);
      
         add(new JLabel("Total Cost:"));
         costField = new JTextField(15);
         add(costField);
      
         add(new JLabel("Running Total:"));
         totalField = new JTextField(15);
         add(totalField);
      }
   
      public void updateDisplay(Yard y, double runningTotal) 
      {
         DecimalFormat df = new DecimalFormat("#.00");
         lastNameField.setText(y.getLastName());
         firstNameField.setText(y.getFirstName());
         sizeField.setText(String.valueOf(y.getSize()));
         costField.setText("$" + df.format(y.getCost()));
         totalField.setText("$" + df.format(runningTotal));
      }
   }
     
   /*********************** CustomerSmallYard ************************/
   public static class CustomerSmallYard implements Yard
   { 
    String firstName, lastName;
     int size;
   
      public CustomerSmallYard(String first, String last, int size)
      {
         firstName = first;
         lastName = last;
         this.size = size;
      }
   
      public String getFirstName() 
      {
         return firstName;
      }
   
      public String getLastName()
      {
         return lastName;
      }
   
      public int getSize()
      {
         return size;
      }
   
      public int compareTo(Yard y)
      {
         return lastName.compareToIgnoreCase(y.getLastName());
      }
   
      public String toString() 
      {
         DecimalFormat df = new DecimalFormat("#.00");
         return lastName + ", " + firstName + " - " + size + " sq ft, Cost: $" + df.format(getCost());
      }

      public double getCost() {
         return size * 0.005;
      }
   }

   /*********************** CustomerMediumYard ************************/
   public static class CustomerMediumYard implements Yard
   {
     String firstName, lastName;
     int size;
   
      public CustomerMediumYard(String first, String last, int size)
      {
         firstName = first;
         lastName = last;
         this.size = size;
      }
   
      public String getFirstName() 
      {
         return firstName;
      }
   
      public String getLastName()
      {
         return lastName;
      }
   
      public int getSize()
      {
         return size;
      }
   
      public int compareTo(Yard y)
      {
         return lastName.compareToIgnoreCase(y.getLastName());
      }
   
      public String toString() 
      {
         DecimalFormat df = new DecimalFormat("#.00");
         return lastName + ", " + firstName + " - " + size + " sq ft, Cost: $" + df.format(getCost());
      }
   
      public double getCost() 
      {
         return size * 0.004;
      }
   }

   /*********************** CustomerLargeYard *************************/
   public static class CustomerLargeYard implements Yard
   {
      String firstName, lastName;
     int size;
   
      public CustomerLargeYard(String first, String last, int size)
      {
         firstName = first;
         lastName = last;
         this.size = size;
      }
   
      public String getFirstName() 
      {
         return firstName;
      }
   
      public String getLastName()
      {
         return lastName;
      }
   
      public int getSize()
      {
         return size;
      }
   
      public int compareTo(Yard y)
      {
         return lastName.compareToIgnoreCase(y.getLastName());
      }
   
      public String toString() 
      {
         DecimalFormat df = new DecimalFormat("#.00");
         return lastName + ", " + firstName + " - " + size + " sq ft, Cost: $" + df.format(getCost());
      }
   
   
      public double getCost()
      {
         return size * 0.003;
      }
   }
}