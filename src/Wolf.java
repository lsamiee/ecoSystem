import java.awt.*;
import javax.swing.JPanel;


public class Wolf extends JPanel {

    public void paint(Graphics g) {

        Image wolf = Toolkit.getDefaultToolkit().getImage("wolf.png");
        g.drawImage(wolf, 110,110, 100, 100,this);
    }
}
