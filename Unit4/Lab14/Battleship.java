//Name: price     Date: 3/11

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Battleship extends JPanel
{
   private JButton[][] board;
   private int[][] matrix;
   private int hits, torpedoes;
   private JLabel label, label1;
   private JButton reset;
   private final int N = 10;
   public Battleship()
   {
   
   try
   {
   UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
 }
 catch(Exception e)
 {
  e.printStackTrace(); 
 }
      setLayout(new BorderLayout());
      hits = 0;
      torpedoes = 20;
   
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("Welcome to Battleship -- You have 20 torpedoes.");
      north.add(label);
      label1 = new JLabel("Hits:"+ hits);
      north.add(label1);
   
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(N,N));
      add(center, BorderLayout.CENTER);
   
      board = new JButton[N][N];
      matrix = new int[N][N];
      for(int r = 0; r < N; r++)
         for(int c = 0; c < N; c++)
         {
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.blue);
             board[r][c].setOpaque(true);
             
            
            board[r][c].addActionListener( new Handler1(r, c) );
            center.add(board[r][c]);
         }
   
      reset = new JButton("Reset");
      reset.addActionListener( new Handler2() );
      reset.setEnabled(false);
      add(reset, BorderLayout.SOUTH);
   
      placeShip();
   }
   private void placeShip()
   {
      int coin = (int)(Math.random() * 2.0 + 1.0);
      int r;
      int c;
      int x;
      if (coin == 1) {
         r = (int)(Math.random() * 7.0);
         c = (int)(Math.random() * 10.0);
      
         for(x = 0; x < 4; x++) {
            matrix[r + x][c] = 1;
         }
      } else {
         r = (int)(Math.random() * 10.0);
         c = (int)(Math.random() * 7.0);
      
         for(x = 0; x < 4; x++) {
            matrix[r][c + x] = 1;
         }
      }
   }
   private class Handler1 implements ActionListener
   {
      private int myRow, myCol;
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
      public void actionPerformed(ActionEvent e)
      {
      
         torpedoes--;
         if (matrix[myRow][myCol] == 1) 
         {
            label.setText("Hit! " + torpedoes + " torpedoes remaining.");
            matrix[myRow][myCol] = 3;
            board[myRow][myCol].setEnabled(false);
            board[myRow][myCol].setBackground(Color.red);
            board[myRow][myCol].setOpaque(true);
    
            hits++;
            label1.setText("Hits:"+hits);
         } 
         else 
         {
            label.setText("Miss! " + torpedoes + " torpedoes remaining.");
            matrix[myRow][myCol] = 2;
            board[myRow][myCol].setEnabled(false);
            board[myRow][myCol].setBackground(Color.white);
             board[myRow][myCol].setOpaque(true);
              
         }
         if (hits == 4 || torpedoes == 0)
         {
            reset.setEnabled(true);
            int r;
            int c;
            for(r = 0; r < 10; r++) 
            {
               for(c = 0; c < 10; c++) 
               {
                  board[r][c].setEnabled(false);
               }
            }
            if (hits == 4) 
            {
               label.setText("You sunk my battleship!");
               label1.setText("Hits:"+hits);
            } 
            
            else 
            {
               for(r = 0; r < 10; r++) 
               {
                  for(c = 0; c < 10; c++) 
                  {
                     if (matrix[r][c] == 1) 
                     {
                        board[r][c].setBackground(Color.black);
                        board[r][c].setOpaque(true);
                        
                     }
                  }
               }
            }
         }
      }
   }
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         
         hits = 0;
         torpedoes = 20;
      
         for(int r = 0; r < 10; r++)
         {
            for(int c = 0; c < 10; c++) 
            {
               board[r][c].setEnabled(true);
               board[r][c].setBackground(Color.blue);
               board[r][c].setOpaque(true);

               matrix[r][c] = 0;
            }
         }
      
         label.setText("You have 20 torpedoes.");
         label1.setText("Hits:"+hits);
         placeShip();
         reset.setEnabled(false);
      }
   }
}

