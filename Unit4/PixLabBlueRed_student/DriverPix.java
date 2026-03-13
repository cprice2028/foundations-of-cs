   //
   // Torbert, 24 July 2013
   // Eckel, 2024
	//
   import javax.swing.JFrame;
   //
   public class DriverPix
   {
      public static void main(String[] args)
      {
         JFrame f = new JFrame("PixLab (revised 2024)");
         f.setSize(900,600);
         f.setLocation(100,50);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setContentPane(new PanelPix());
         f.setVisible(true);
      }
   }
   //
	// end of file
	//