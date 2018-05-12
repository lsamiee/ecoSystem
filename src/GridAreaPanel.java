
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.imageio.*;

class GridAreaPanel extends JPanel {
    Sheep sheep = new Sheep();
    Wolf wolf = new Wolf();
    Plant plant = new Plant();

    public void paint(Graphics g) {
        paintSheep(g);
        paintWolf(g);
        paintPlant(g);
        setVisible(true);
    }

    private void paintSheep(Graphics g) {
        Image sheep = Toolkit.getDefaultToolkit().getImage("sheep.png");
        g.drawImage(sheep, 10, 10, 100, 100, this);
    }

    private void paintWolf(Graphics g) {

        Image wolf = Toolkit.getDefaultToolkit().getImage("wolf.png");
        g.drawImage(wolf, 110, 110, 100, 100, this);
    }

    private void paintPlant(Graphics g) {
        Image plant = Toolkit.getDefaultToolkit().getImage("plant.png");
        g.drawImage(plant, 210, 210, 100, 100, this);
    }
}
