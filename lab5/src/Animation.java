import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation extends JPanel {


    private JFrame frame;
    private Timer timer;
    private Image image;

    public Animation() {
        frame = new JFrame("Animation Lab5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,520);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("image/pic1.png").getImage();
        count = 0;
        timer = new Timer();
        timer.schedule(animate, 1, 150);
    }

    private int count;
    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            switch (count) {
                case 1:
                    image = new ImageIcon("image/pic1.png").getImage();
                    break;
                case 2:
                    image = new ImageIcon("image/pic2.png").getImage();
                    break;
                case 3:
                    image = new ImageIcon("image/pic3.png").getImage();
                    break;
                case 4:
                    image = new ImageIcon("image/pic4.png").getImage();
                    break;
                case 5:
                    image = new ImageIcon("image/pic5.png").getImage();
                    break;
                case 6:
                    image = new ImageIcon("image/pic6.png").getImage();
                    break;
                case 7:
                    image = new ImageIcon("image/pic7.png").getImage();
                    break;
                case 8:
                    image = new ImageIcon("image/pic8.png").getImage();
                    break;
                case 9:
                    image = new ImageIcon("image/pic9.png").getImage();
                    break;
                case 10:
                    image = new ImageIcon("image/pic10.png").getImage();
                    break;

                default:
                    break;
            }
            count++;
            if (count == 11) {
                count = 1;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0, null);
    }


    public static void main(String[] args) {
        new Animation();
    }
}