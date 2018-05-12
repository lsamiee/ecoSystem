import java.awt.*;
import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        GridAreaPanel panel = new GridAreaPanel();

        // create a basic JFrame
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("My Echo System");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add panel to main frame
        frame.add(panel);
        frame.setVisible(true);

    }
}



