//
//name:   price   date: 3/13
//
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
//
   public class PanelPix extends JPanel
   {
   
      private DisplayPix display;
   
      private ScoreboardPix scoreboard;
      private JTextField pixelateField;
   
      public PanelPix()
      {
         setLayout(new BorderLayout());
      //
      // north
      //
         scoreboard = new ScoreboardPix();
         add(scoreboard,BorderLayout.NORTH);
      //
      // east
      //
         JPanel east = new JPanel();
         east.setLayout(new GridLayout(25,1)); // 21 buttons and 3 labels and 1 text field
         
      /****************************************************************** BLUE label */
         JLabel blue = new JLabel("BLUE credit");
         blue.setHorizontalAlignment(SwingConstants.CENTER);
         blue.setBackground(Color.BLUE);
         blue.setOpaque(true);
         blue.setForeground(Color.WHITE);
         east.add(blue);
      /******************************************************************  1 */
         JButton zero = new JButton("Zero Blue");
         zero.addActionListener(new Listener_zeroBlue());
         east.add(zero);
      /******************************************************************  2 */
         JButton negate = new JButton("Negate");
         negate.addActionListener(new Listener_negate());
         east.add(negate);
      /******************************************************************  3 */
         JButton gray = new JButton("Grayscale");
         gray.addActionListener(new Listener_gray());
         east.add(gray);
      /******************************************************************  4 */
         JButton quads = new JButton("Color Quadrants");
         quads.addActionListener(new Listener_colorq());
         east.add(quads);
      /******************************************************************  5 */
         JButton mirrorLR = new JButton("Mirror Left-Right");
         mirrorLR.addActionListener(new Listener_mlr());
         east.add(mirrorLR);			
      /******************************************************************  6 */
         JButton mirrorUD = new JButton("Mirror Up-Down");
         mirrorUD.addActionListener(new Listener_mud());
         east.add(mirrorUD);
      /******************************************************************  7 */
         JButton flipLR = new JButton("Flip Left-Right");
         flipLR.addActionListener(new Listener_flr());
         east.add(flipLR);
      /******************************************************************  8 */
         JButton flipUD = new JButton("Flip Up-Down");
         flipUD.addActionListener(new Listener_fud());
         east.add(flipUD);			
      /******************************************************************  9 */
         JButton hBar = new JButton("Horizontal Bars");
         hBar.addActionListener(new Listener_hbar());
         east.add(hBar);		
      /****************************************************************** 10 */
         JButton vStripe = new JButton("Vertical Sepia Stripes");
         vStripe.addActionListener(new Listener_sep());
         east.add(vStripe);		
      /****************************************************************** 11 */
         JButton grid = new JButton("Make Grid");
         grid.addActionListener(new Listener_grid());
         east.add(grid);
      /****************************************************************** 12 */
         JButton checkerboard = new JButton("Checkerboard");
         checkerboard.addActionListener(new Listener_check());
         east.add(checkerboard);
      /****************************************************************** RED label */
         JLabel red = new JLabel("RED credit");
         red.setHorizontalAlignment(SwingConstants.CENTER);
         red.setBackground(Color.RED);
         red.setOpaque(true);
         red.setForeground(Color.WHITE);
         east.add(red);
      /****************************************************************** 13 */
         JButton blur = new JButton("Blur");
         blur.addActionListener(new Listener_blur());
         east.add(blur);
      /****************************************************************** 14 */
         JButton blur20 = new JButton("Blur-20");
         blur20.addActionListener(new Listener_blur20());
         east.add(blur20);								
      /****************************************************************** 15 */
         JButton posterize = new JButton("Posterize");
         posterize.addActionListener(new Listener_posterize());
         east.add(posterize);		
      /****************************************************************** 16 */
         JButton pixelate10 = new JButton("Pixelate-10");
         pixelate10.addActionListener(new Listener_pixelate10());
         east.add(pixelate10);		
      /****************************************************************** 17 */
         JButton pixelateAny = new JButton("Pixelate-Any");
         pixelateAny.addActionListener(new Listener_pixelateAny());
         east.add(pixelateAny);	
         pixelateField = new JTextField(10);
         east.add(pixelateField);
      /****************************************************************** 18 */
         JButton detect = new JButton("Edge Detector");
         detect.addActionListener(new Listener_edgeDetector());
         east.add(detect);
      /****************************************************************** 19 */
         JButton mystery = new JButton("MYSTERY BUTTON");
         mystery.addActionListener(new Listener_mystery());
         east.add(mystery);
      /****************************************************************** ACCELERATED label */
         JLabel accel = new JLabel("ACCELERATED credit");
         accel.setHorizontalAlignment(SwingConstants.CENTER);
         accel.setBackground(Color.BLACK);
         accel.setOpaque(true);
         accel.setForeground(Color.WHITE);
         east.add(accel);
      /****************************************************************** 20 */
         JButton chromakey = new JButton("Chromakey");
         chromakey.setEnabled(false);
         east.add(chromakey);		
      /****************************************************************** 21 */
         JButton shift = new JButton("Color Shift");
         shift.setEnabled(false);
         east.add(shift);
      /****************************************************************** END */      
         add(east,BorderLayout.EAST);
      //
      // center
      //
         display = new DisplayPix();
         display.addMouseListener(new Mouse());
      
         display.addKeyListener(new Key());
         display.setFocusable(true);
         add(display,BorderLayout.CENTER);
      //
      // south
      //
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         JButton restore = new JButton("Restore Original Image");
         restore.addActionListener(new Listener_restore());
         south.add(restore);
         JButton openimg = new JButton("Open an Image File");
         openimg.addActionListener(new Listener_openimg());
         south.add(openimg);
         JButton undo = new JButton("Undo");
         undo.setEnabled(false);
         south.add(undo);
         add(south,BorderLayout.SOUTH);
      }    
   //
   /**********************************************************************/
   //
   // pixel operation listener
   // 
      private class Listener_zeroBlue implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.zeroBlue();
            update( display.getXval() , display.getYval() );
         }
      } 
   //  ---------->  add more Listeners here   <-----------
   private class Listener_negate implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.negate();
            update( display.getXval() , display.getYval() );
         }
      } 
       private class Listener_gray implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.gray();
            update( display.getXval() , display.getYval() );
         }
      } 
   private class Listener_colorq implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.colorq();
            update( display.getXval() , display.getYval() );
         }
      } 
      private class Listener_mlr implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.mlr();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_mud implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.mud();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_flr implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.flr();
            update( display.getXval() , display.getYval() );
         }
      }  
      private class Listener_fud implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.fud();
            update( display.getXval() , display.getYval() );
         }
      }
    private class Listener_hbar implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.hbar();
            update( display.getXval() , display.getYval() );
         }
      }
     private class Listener_sep implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.sep();
            update( display.getXval() , display.getYval() );
         }
      }
   
    private class Listener_grid implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.grid();
            update( display.getXval() , display.getYval() );
         }
      }
   private class Listener_check implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.check();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_blur implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.blur();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_blur20 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.blur20();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_posterize implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.posterize();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_pixelate10 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.pixelate10();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_pixelateAny implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
                  try 
                  {
                     int x = Integer.parseInt(pixelateField.getText());
                     display.pixelateAny(x);
                     update(display.getXval(), display.getYval());
                  } catch (NumberFormatException ex)
                   {
                     JOptionPane.showMessageDialog(null, "Please enter a valid number in the pixelate field.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                  }
               
          }
      }
      private class Listener_edgeDetector implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.edgeDetector();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_mystery implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.mystery();
            update( display.getXval() , display.getYval() );
         }
      }
      
   //   
   /**********************************************************************/
   //
      private class Listener_restore implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.resetImage();
            update( display.getXval() , display.getYval() );
         }
      }
      private class Listener_openimg implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if( display.openImage() )
            {
               update( display.getXval() , display.getYval() );
            }
         }
      }
      private class Mouse extends MouseAdapter
      {
         public void mouseClicked(MouseEvent e)
         {
            update( e.getX() , e.getY() );
         }
      }
      private class Key extends KeyAdapter
      {
         public void keyPressed(KeyEvent e)
         {
            switch( e.getKeyCode() )
            {
               case KeyEvent.VK_UP:    display.up();    
                  break;
               case KeyEvent.VK_DOWN:  display.down();  
                  break;
               case KeyEvent.VK_LEFT:  display.left();  
                  break;
               case KeyEvent.VK_RIGHT: display.right(); 
                  break;
            }
         //
            update( display.getXval() , display.getYval() );
         }
      }     
      private void update(int x, int y)
      {
      int rgb = display.getRGB(x,y);
   //
      display.update(x,y);
      scoreboard.update(display.getCol(),display.getRow(),rgb);
   //
      display.repaint();
   //
      display.requestFocus();
      }
   }
//
// end of file
//