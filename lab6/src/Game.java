import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Game extends JFrame {

    static class ImagePanel extends JComponent {
        private Image image;

        public ImagePanel(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }

    public Game(){

        int number;
        AtomicInteger counter = new AtomicInteger(0);

        setTitle("Guess what");
        setSize(900,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        try {
            BufferedImage myImage = ImageIO.read(new File("image/pic1.png"));
            setContentPane(new ImagePanel(myImage));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel head = new JLabel("Угадайте число:");
        head.setBounds(200,150,450,50);
        head.setFont(head.getFont().deriveFont(50.0f));
        head.setHorizontalAlignment(SwingUtilities.CENTER);
        head.setForeground(Color.BLACK);

        JTextField num = new JTextField();
        num.setBounds(325,300,200,50);
        num.setFont(num.getFont().deriveFont(25.0f));
        num.setHorizontalAlignment(SwingUtilities.CENTER);

        JButton guess = new JButton("Угадать");
        guess.setBounds(300,450,250,50);
        guess.setFont(guess.getFont().deriveFont(20.0f));
        guess.setHorizontalAlignment(SwingUtilities.CENTER);

        JLabel res = new JLabel("");
        res.setBounds(200,600,450,200);
        res.setFont(res.getFont().deriveFont(25.0f));
        res.setHorizontalAlignment(SwingUtilities.CENTER);
        res.setForeground(Color.BLACK);
        res.setOpaque(true);
        res.setBackground(Color.WHITE);

        add(head);
        add(num);
        add(guess);
        add(res);

        number = (int)(Math.random()*20);

        guess.addActionListener(action -> {

            try {
                if ((Integer.parseInt(num.getText()) < 0) || (Integer.parseInt(num.getText()) > 20)) {
                    JOptionPane.showMessageDialog(null, "Введите другое число");
                    counter.lazySet(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод");
            }
                if ((Integer.parseInt(num.getText()) < number)) {
                    res.setText("Загаданное число больше");
                    if (counter.get() == 2) {
                        JOptionPane.showMessageDialog(null, "Вы не угадали :с");
                        counter.getAndIncrement();
                        setVisible(false);
                        dispose();
                    }
                    counter.getAndIncrement();
                    System.out.println(counter);
                } else if ((Integer.parseInt(num.getText()) > number)) {
                    res.setText("Загаданное число меньше");
                    if (counter.get() == 2) {
                        JOptionPane.showMessageDialog(null, "Вы не угадали :с");
                        counter.getAndIncrement();
                        setVisible(false);
                        dispose();
                    }

                } else {
                    res.setText("Правильно");
                    JOptionPane.showMessageDialog(null, "Вы угадали с:");
                    setVisible(false);
                    dispose();
                }
        });
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);

    }
}
