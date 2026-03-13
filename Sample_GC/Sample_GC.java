// Name: price  Date: 5/15

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

interface Yard {
   public abstract double getCost();

   public abstract String getFirstName();

   public abstract String getLastName();

   public abstract int compareTo(Yard y);

   public abstract String toString();

   public abstract int getSize();
}

public class Sample_GC {

   /********************* driver *************************/
   public static void main(String[] args) {
      JFrame frame = new JFrame("Sample Final Exam");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }

   /********************* panel *************************/
   public static class PanelSampleYard extends JPanel {
      private ArrayList<Yard> customers = new ArrayList<>();
      private DisplaySampleYard display;
      private int index = 0;
      private double total = 0;

      public PanelSampleYard() {
         setLayout(new BorderLayout());
         JLabel mowing = new JLabel("Green and Grow Mowing Company");
         mowing.setHorizontalAlignment(SwingConstants.CENTER);
         add(mowing, BorderLayout.NORTH);

         JPanel buttons = new JPanel();
         buttons.setLayout(new BorderLayout());

         JButton next = new JButton("Next");
         next.setHorizontalAlignment(SwingConstants.CENTER);
         next.addActionListener(e -> {
            if (index < customers.size()) {
               Yard current = customers.get(index++);
               total += current.getCost();
               display.updateDisplay(current, total);
            } else {
               JOptionPane.showMessageDialog(this, "No more customers.");
            }
         });
         buttons.add(next, BorderLayout.WEST);

         JButton quit = new JButton("Quit");
         quit.addActionListener(e -> System.exit(0));
         quit.setHorizontalAlignment(SwingConstants.CENTER);
         buttons.add(quit, BorderLayout.EAST);

         add(buttons, BorderLayout.SOUTH);

         display = new DisplaySampleYard();
         add(display, BorderLayout.CENTER);

         readFile();
      }

      private void readFile() {
         try {
            String fileName = JOptionPane.showInputDialog("Enter filename:");
            try (Scanner input = new Scanner(new File(fileName))) {
               int numCustomers = Integer.parseInt(input.nextLine().trim());
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

                  customers.add(yard);
               }
               Collections.sort(customers, Comparator.comparing(Yard::getLastName));
            }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
         }
      }
   }

   /********************* display *************************/
   public static class DisplaySampleYard extends JPanel {
      private JTextField lastNameField, firstNameField, sizeField, costField, totalField;

      public DisplaySampleYard() {
         setLayout(new GridLayout(5, 2, 5, 5));

         add(new JLabel("Last Name:"));
         lastNameField = new JTextField(15);
         lastNameField.setEditable(false);
         add(lastNameField);

         add(new JLabel("First Name:"));
         firstNameField = new JTextField(15);
         firstNameField.setEditable(false);
         add(firstNameField);

         add(new JLabel("Lawn Size:"));
         sizeField = new JTextField(15);
         sizeField.setEditable(false);
         add(sizeField);

         add(new JLabel("Total Cost:"));
         costField = new JTextField(15);
         costField.setEditable(false);
         add(costField);

         add(new JLabel("Running Total:"));
         totalField = new JTextField(15);
         totalField.setEditable(false);
         add(totalField);
      }

      public void updateDisplay(Yard y, double runningTotal) {
         DecimalFormat df = new DecimalFormat("#.00");
         lastNameField.setText(y.getLastName());
         firstNameField.setText(y.getFirstName());
         sizeField.setText(String.valueOf(y.getSize()));
         costField.setText("$" + df.format(y.getCost()));
         totalField.setText("$" + df.format(runningTotal));
      }
   }

   /*********************** Abstract base class ************************/
   public static abstract class AbstractCustomerYard implements Yard {
      protected String firstName, lastName;
      protected int size;

      public AbstractCustomerYard(String first, String last, int size) {
         this.firstName = first;
         this.lastName = last;
         this.size = size;
      }

      public String getFirstName() {
         return firstName;
      }

      public String getLastName() {
         return lastName;
      }

      public int getSize() {
         return size;
      }

      public int compareTo(Yard y) {
         return this.lastName.compareToIgnoreCase(y.getLastName());
      }

      public String toString() {
         DecimalFormat df = new DecimalFormat("#.00");
         return lastName + ", " + firstName + " - " + size + " sq ft, Cost: $" + df.format(getCost());
      }
   }

   /*********************** CustomerSmallYard ************************/
   public static class CustomerSmallYard extends AbstractCustomerYard {
      public CustomerSmallYard(String first, String last, int size) {
         super(first, last, size);
      }

      public double getCost() {
         return size * 0.005;
      }
   }

   /*********************** CustomerMediumYard ************************/
   public static class CustomerMediumYard extends AbstractCustomerYard {
      public CustomerMediumYard(String first, String last, int size) {
         super(first, last, size);
      }

      public double getCost() {
         return size * 0.004;
      }
   }

   /*********************** CustomerLargeYard *************************/
   public static class CustomerLargeYard extends AbstractCustomerYard {
      public CustomerLargeYard(String first, String last, int size) {
         super(first, last, size);
      }

      public double getCost() {
         return size * 0.003;
      }
   }
}