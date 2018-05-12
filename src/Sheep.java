import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.imageio.*;

public class Sheep extends JPanel {

    public void paint(Graphics g) {
        Image sheep = Toolkit.getDefaultToolkit().getImage("sheep.png");
        g.drawImage(sheep, 10,10, 100, 100,this);
    }

}
