import javax.swing.*;

public class Driver14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        frame.setSize(408, 438);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BumperPanel());
        frame.setVisible(true);
    }
}