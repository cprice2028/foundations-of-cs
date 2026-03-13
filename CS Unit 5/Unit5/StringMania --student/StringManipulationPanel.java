//Torbert, e-mail: smtorbert@fcps.edu    version 4.4.2003
//Billington, mlbillington@fcps.edu   date 2/14/2024
   
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//
public class StringManipulationPanel extends JPanel
{
// global constants
   private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
   private final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private final String vowels = "AEIOUaeiou";

   // global variables
   private JTextArea area;

   public StringManipulationPanel()
   {
      setLayout(new BorderLayout());
   //
   // north
   //
      JLabel label = new JLabel("String Mania!");
      label.setFont(new Font("SansSerif", Font.BOLD, 40));
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setForeground(Color.WHITE);
      label.setBackground(Color.BLACK);
      label.setOpaque(true);
      add(label,BorderLayout.NORTH);
      
   //
   // center
   //
      area = new JTextArea("");
      String text = "The quick brown fox jumps over the lazy dog.";
      area.setText(text);
      area.setPreferredSize(new Dimension(50,30));
      area.setFont(new Font("Serif", Font.PLAIN, 16));
      area.setLineWrap(true);
      area.setWrapStyleWord(true);
   
      add(area,BorderLayout.CENTER);
   //
   // south
   //   
      JPanel south = new JPanel(new FlowLayout()); 
      south.add(new FontPanel(area));
      south.add(new StylePanel(area));
      south.add(new SizePanel(area));
      JButton reset = new JButton("Reset");
      reset.addActionListener(new Listener_reset());
      south.add(reset);
      add(south, BorderLayout.SOUTH);
   
   //
   // east Buttons
   //
      JPanel east = new JPanel();
      add(east, BorderLayout.EAST);   
      east.setLayout(new GridLayout(20,1)); //18 buttons and 2 labels
   /********************************************************* BLUE label */
      JLabel blue = new JLabel("BLUE credit");
      blue.setHorizontalAlignment(SwingConstants.CENTER);
      blue.setBackground(Color.BLUE);
      blue.setOpaque(true);
      blue.setForeground(Color.WHITE);
      east.add(blue);
   /******************************************************************  1 */
      JButton upperCase = new JButton("To Upper Case");
      upperCase.addActionListener(new Listener_upperCase()); 
      upperCase.setEnabled(true);
      east.add(upperCase);
   /******************************************************************  2 */
      JButton lowerCase = new JButton("To Lower Case");
      lowerCase.setEnabled(true);
      lowerCase.addActionListener(new Listener_lowerCase());
      east.add(lowerCase);
   /******************************************************************  3 */
      JButton flip = new JButton("Flip Case");
      flip.addActionListener(new Listener_flipCase()); 
      flip.setEnabled(true);
      east.add(flip);
   /******************************************************************  4 */
      JButton reverse = new JButton("Reverse the Letters");
      reverse.setEnabled(true);
      reverse.addActionListener(new Listener_reverse());
      east.add(reverse);
   /******************************************************************  5 */
      JButton punct = new JButton("Remove Punctuation");
      punct.setEnabled(true);
      punct.addActionListener(new Listener_punct());
      east.add(punct);			
   /******************************************************************  6 */
      JButton removeSpaces = new JButton("Remove Spaces");
      removeSpaces.setEnabled(true);
      removeSpaces.addActionListener(new Listener_removeSpaces());
      east.add(removeSpaces);			
   /******************************************************************  7 */
      JButton removeVowels = new JButton("Remove Vowels");
      removeVowels.setEnabled(true);
      removeVowels.addActionListener(new Listener_removeVowels());
      east.add(removeVowels);					
   /******************************************************************  8 */
      JButton doubleVowels = new JButton("Double Each Vowel");
      doubleVowels.setEnabled(true);
      doubleVowels.addActionListener(new Listener_doubleVowels());
      east.add(doubleVowels);			
   /******************************************************************  9 */
      JButton reverseWords = new JButton("Reverse the Words");
      reverseWords.setEnabled(true);
      reverseWords.addActionListener(new Listener_reverseWords());
      east.add(reverseWords);
   /****************************************************************** 10 */
      JButton swapHalves = new JButton("Swap Halves by Length");
      swapHalves.setEnabled(true);
      swapHalves.addActionListener(new Listener_swapHalves());
      east.add(swapHalves);
   /****************************************************************** 11 */
      JButton swapHalvesWords = new JButton("Swap Halves by Words");
      swapHalvesWords.setEnabled(true);
      swapHalvesWords.addActionListener(new Listener_swapHalvesWords());
      east.add(swapHalvesWords);
   /*********************************************************** RED label */
      JLabel red = new JLabel("RED credit");
      red.setHorizontalAlignment(SwingConstants.CENTER);
      red.setBackground(Color.RED);
      red.setOpaque(true);
      red.setForeground(Color.WHITE);
      east.add(red);			
   /****************************************************************** 12 */
      JButton triangle = new JButton("Left-Side Triangle");
      triangle.setEnabled(false);
      east.add(triangle);			
   /****************************************************************** 13 */
      JButton rTriangle = new JButton("Right-Side Triangle");
      rTriangle.setEnabled(false);
      east.add(rTriangle);	
   /****************************************************************** 14 */
      JButton ceasar = new JButton("Caesar Shift");
      ceasar.setEnabled(false);
      east.add(ceasar);									
   /****************************************************************** 15 */
      JButton decodeCaesar = new JButton("Decode Caesar");
      decodeCaesar.setEnabled(false);
      east.add(decodeCaesar);
   /****************************************************************** 16 */
      JButton pigLatin = new JButton("PigLatinize One Word");
      pigLatin.setEnabled(false);
      east.add(pigLatin);	
   /****************************************************************** 17 */
      JButton pigLatinSentence = new JButton("PigLatinize the Sentence");
      pigLatinSentence.setEnabled(false);
      east.add(pigLatinSentence);			
   /****************************************************************** 18 */
      JButton mystery = new JButton("MYSTERY BUTTON");
      mystery.setEnabled(false);
      east.add(mystery);	
   }
  
//
// text transformation listeners
// 
   private class Listener_flipCase implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String text = area.getText();
         String newText = "";
         for(int i=0; i<text.length(); i++)
         {
            String letter = text.substring(i, i+1); //""+text.charAt(i);
            if( alphabet.contains(letter) )
               if( upperCase.contains(letter) )
                  newText += letter.toLowerCase();
               else
                  newText += letter.toUpperCase();
            else
               newText += letter;
         }
         area.setText( newText );
      }
   } 
   // ADD ADDITIONAL LISTENERS HERE!
   private class Listener_upperCase implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String text = area.getText();
         String newText = "";
         for(int i=0; i<text.length(); i++)
         {
            String letter = text.substring(i, i+1); //""+text.charAt(i);
            if( alphabet.contains(letter) )
                  newText += letter.toUpperCase();
            else
               newText += letter;
         }
         area.setText( newText );
      }
   } 
   private class Listener_lowerCase implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String text = area.getText();
         String newText = "";
         for(int i=0; i<text.length(); i++)
         {
            String letter = text.substring(i, i+1); //""+text.charAt(i);
            if( alphabet.contains(letter) )
                  newText += letter.toLowerCase();
            else
               newText += letter;
         }
         area.setText( newText );
      }
   } 
   private class Listener_reverse implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String text = area.getText();
         String newText = "";
         for(int i = text.length()-1; i>=0; i--)
         {
            String letter = text.substring(i, i+1);
            newText+=letter;
         }
         area.setText( newText );
      }
   } 
   
   private class Listener_punct implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            for(int i=0; i<text.length(); i++)
            {
               String letter = text.substring(i, i+1);
               if( alphabet.contains(letter) || letter.equals(" ") )
                  newText += letter;
            }
            area.setText( newText );
         }
      };
   private class Listener_removeSpaces implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            for(int i=0; i<text.length(); i++)
            {
               String letter = text.substring(i, i+1);
               if( !letter.equals(" ") )
                  newText += letter;
            }
            area.setText( newText );
         }
      }
   private class Listener_removeVowels implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            for(int i=0; i<text.length(); i++)
            {
               String letter = text.substring(i, i+1);
               if( !vowels.contains(letter) )
                  newText += letter;
            }
            area.setText( newText );
         }
      }
   private class Listener_doubleVowels implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            for(int i=0; i<text.length(); i++)
            {
               String letter = text.substring(i, i+1);
               if( vowels.contains(letter) )
                  newText += letter + letter;
               else
                  newText += letter;
            }
            area.setText( newText );
         }
      }
   private class Listener_reverseWords implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            String[] words = text.split(" ");
            for(int i=words.length-1; i>=0; i--)
            {
               newText += words[i] + " ";
            }
            area.setText( newText );
         }
      }
   private class Listener_swapHalves implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            int mid = text.length()/2;
            String firstHalf = text.substring(0, mid);
            String secondHalf = text.substring(mid);
            newText = secondHalf + firstHalf;
            area.setText( newText );
         }
      }
   private class Listener_swapHalvesWords implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            String text = area.getText();
            String newText = "";
            String[] words = text.split(" ");
            int mid = words.length/2;
            for(int i=mid; i<words.length; i++)
            {
               newText += words[i] + " ";
            }
            for(int i=0; i<mid; i++)
            {
               newText += words[i] + " ";
            }
            area.setText( newText );
         }
      }
//   
/************************Listener for Reset **********************************************/
//
   private class Listener_reset implements ActionListener
   {
   
      public void actionPerformed(ActionEvent e)
      {
         String text = "The quick brown fox jumps over the lazy dog.";
         area.setText( text );
         area.setPreferredSize(new Dimension(50,30));
         area.setFont(new Font("Serif", Font.PLAIN, 16));
         area.setLineWrap(true);
         area.setWrapStyleWord(true);
      }
   }
}
//
// end of file
//