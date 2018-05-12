import java.awt.*;
import javax.swing.JPanel;


public class Plant extends JPanel {
    public int locationX;
    public int locationY;
    public int grassRatio = 1;


    public void paint(Graphics g) {
        Image plant = Toolkit.getDefaultToolkit().getImage("plant.png");
        g.drawImage(plant, 210,210, 100, 100,this);
    }

}
