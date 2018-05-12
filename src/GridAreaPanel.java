
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.imageio.*;

class GridAreaPanel extends JPanel
{
    Sheep sheep = new Sheep();
    Wolf wolf = new Wolf();
    Plant plant = new Plant();

    public void paint(Graphics g) {
        this.sheep.paint(g);
        this.wolf.paint(g);
        this.plant.paint(g);
        this.setVisible(true);
    }
}